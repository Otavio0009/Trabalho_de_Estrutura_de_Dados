package SegundoTrabalho.Filas.ControleDeProcessos;

public class Executor {
    public static void main(String[] args) {
        Fila<Processo> filaCPU = new Fila<>(10);

        // 1. Adicionar processos à fila
        filaCPU.insereElemento(new Processo("PROC_01", 3));
        filaCPU.insereElemento(new Processo("PROC_02", 5));
        filaCPU.insereElemento(new Processo("PROC_03", 2));
        filaCPU.insereElemento(new Processo("PROC_04", 4));

        System.out.println("=== Gerenciador de Processos Iniciado ===\n");
        System.out.println("Processos aguardando: " + filaCPU.tamanho());
        System.out.println("-----------------------------------------\n");

        while (!filaCPU.estaVasia()) {
            Processo atual = filaCPU.desenfileira();

            System.out.println("[EXECUTANDO] " + atual.getIdentificador());
            System.out.println("Tempo estimado: " + atual.getTempoExecucao() + "s...");

            System.out.println("[CONCLUÍDO] " + atual.getIdentificador());
            System.out.println("Processos restantes na fila: " + filaCPU.tamanho());
            System.out.println("-----------------------------------------");
        }

        System.out.println("\nTodos os processos foram finalizados com sucesso.");
    }
}
