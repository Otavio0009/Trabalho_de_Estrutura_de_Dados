package SegundoTrabalho.Filas.FilaDeChamadaTelefonica;

public class CentralTelefonica {
    public static void main(String[] args) {
        Fila<Chamada> filaEspera = new Fila<>(10);

        // 1. Enfileirar as chamadas recebidas
        filaEspera.insereElemento(new Chamada("Ana Souza", "Reclamação de sinal"));
        filaEspera.insereElemento(new Chamada("Carlos Lima", "Dúvida sobre fatura"));
        filaEspera.insereElemento(new Chamada("Beatriz Silva", "Cancelamento de plano"));
        filaEspera.insereElemento(new Chamada("Marcos Rocha", "Contratação de internet"));
        filaEspera.insereElemento(new Chamada("Julia Costa", "Suporte técnico"));

        System.out.println("=== Central Telefônica Ativa ===\n");
        System.out.println("Chamadas em espera: " + filaEspera.tamanho());
        System.out.println("--------------------------------\n");

        while (!filaEspera.estaVasia()) {
            Chamada chamadaAtual = filaEspera.desenfileira();

            System.out.println("[EM ATENDIMENTO] " + chamadaAtual);

            int aguardando = filaEspera.tamanho();
            System.out.println(">> Aguardando na linha: " + aguardando);
            System.out.println("--------------------------------");
        }

        System.out.println("\nFim do expediente. Todas as chamadas foram concluídas!");
    }
}