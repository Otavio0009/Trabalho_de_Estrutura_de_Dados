package SegundoTrabalho.SenhasComPrioridades;

public class Atendimento {
    public static void  main(String[] args) {
        Fila<Pessoa> filaNormal = new Fila<>(10);
        Fila<Pessoa> filaPrioritaria = new Fila<>(10);

        filaPrioritaria.insereElemento(new Pessoa("Ana", true));
        filaPrioritaria.insereElemento(new Pessoa("Beto", true));
        filaPrioritaria.insereElemento(new Pessoa("Caio", true));
        filaPrioritaria.insereElemento(new Pessoa("Duda", true));

        filaNormal.insereElemento(new Pessoa("João", false));
        filaNormal.insereElemento(new Pessoa("Maria", false));

        int contPrioridade = 0;

        System.out.println("=== Iniciando Sistema de Chamada ===\n");

        while (!filaNormal.estaVasia() || !filaPrioritaria.estaVasia()) {

            boolean atenderPrioridade = false;

            if (!filaPrioritaria.estaVasia()) {

                if (contPrioridade < 3 || filaNormal.estaVasia()) {

                    atenderPrioridade = true;

                } else {

                    atenderPrioridade = false;
                }
            } else {

                atenderPrioridade = false;
            }

            if (atenderPrioridade) {

                Pessoa p = filaPrioritaria.desenfileira();
                System.out.println("[CHAMANDO] " + p);
                contPrioridade++;

            } else if (!filaNormal.estaVasia()) {

                Pessoa n = filaNormal.desenfileira();
                System.out.println("[CHAMANDO] " + n);
            }

            System.out.println("\nFim do atendimento: Filas vazias.");
        }
    }
}
