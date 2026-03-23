package PrimeiroTrabalho_Vetor;

public class Teste07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A"); // índice 0
        vetor.adicionar("B"); // índice 1
        vetor.adicionar("C"); // índice 2
        vetor.adicionar("D"); // índice 3
        vetor.adicionar("E"); // índice 4

        System.out.println("PrimeiroTrabalho_Vetor.Vetor inicial: " + vetor);

        vetor.remover(0);
        System.out.println("Após remover o primeiro (índice 0): " + vetor + " | Tamanho: " + vetor.tamanho());

        vetor.remover(1);
        System.out.println("Após remover o meio (índice 1): " + vetor + " | Tamanho: " + vetor.tamanho());

        vetor.remover(vetor.tamanho() - 1);
        System.out.println("Após remover o último: " + vetor + " | Tamanho: " + vetor.tamanho());

        // Primeiro erro:
        // vetor.remover(10);
        // System.out.println("Removendo o elemento no indici 10: "  + vetor +  " | Tamanho: " + vetor.tamanho());

        // Segundo erro:
        // vetor.remover(4);
        // System.out.println("Após remover o último: " + vetor + " | Tamanho: " + vetor.tamanho());
    }
}