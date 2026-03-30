package SegundoTrabalho.Filas.AgendamentoDeTarefasDoSistema;

public class SimulacaoSistema {
    public static void main(String[] args) {
        FilaPrioridadeTarefa<Tarefa> filaSistema = new FilaPrioridadeTarefa<>(10);

        filaSistema.adicionarTarefa(new Tarefa("Backup do Sistema", 3));
        filaSistema.adicionarTarefa(new Tarefa("Patch de Segurança", 1));
        filaSistema.adicionarTarefa(new Tarefa("Atualização de UI", 3));
        filaSistema.adicionarTarefa(new Tarefa("Limpeza de Cache", 2));

        System.out.println("=== ESCALONADOR DE TAREFAS INICIADO ===\n");

        while (!filaSistema.estaVasia()) {

            System.out.print("Fila atual: [");
            for (int i = 0; i < filaSistema.tamanho(); i++) {
                System.out.print(filaSistema.busca(i).getNome() + (i < filaSistema.tamanho() - 1 ? ", " : ""));
            }
            System.out.println("]");

            Tarefa tarefaAtual = filaSistema.desenfileira();
            System.out.println(">> EXECUTANDO: " + tarefaAtual.getNome() + " (Prio: " + tarefaAtual.getPrioridade() + ")");

            System.out.print("Fila após remoção: [");
            for (int i = 0; i < filaSistema.tamanho(); i++) {
                System.out.print(filaSistema.busca(i).getNome() + (i < filaSistema.tamanho() - 1 ? ", " : ""));
            }
            System.out.println("]");

            System.out.println("------------------------------------------");
        }

        System.out.println("Sistema ocioso: Todas as tarefas concluídas.");
    }
}