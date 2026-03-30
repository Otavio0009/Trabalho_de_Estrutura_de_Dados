package SegundoTrabalho.Filas.ProntoSocorro;

public class Atendimento {
    public static void main(String[] args) {
        FilaPrioritaria<Paciente> filaPS = new FilaPrioritaria<>(6);

        // 1. Enfileirar 6 pacientes com prioridades diferentes
        filaPS.enfileiraPrioridade(new Paciente("Carlos", 3));
        filaPS.enfileiraPrioridade(new Paciente("Ana", 1));
        filaPS.enfileiraPrioridade(new Paciente("Beto", 2));
        filaPS.enfileiraPrioridade(new Paciente("Dora", 1));
        filaPS.enfileiraPrioridade(new Paciente("Edu", 3));
        filaPS.enfileiraPrioridade(new Paciente("Fabio", 2));

        System.out.println("=== FILA DE ESPERA ORGANIZADA (POR PRIORIDADE) ===");

        for(int i = 0; i < filaPS.tamanho(); i++) {
            System.out.println((i+1) + "º - " + filaPS.busca(i));
        }
        System.out.println("--------------------------------------------------\n");

        System.out.println("=== INICIANDO ATENDIMENTOS ===");
        while (!filaPS.estaVasia()) {

            Paciente atendido = filaPS.desenfileira();
            System.out.println("[ATENDIDO] " + atendido);
        }

        System.out.println("\nTodos os pacientes foram atendidos. Pronto-socorro vazio.");
    }
}
