package PrimeiroTrabalho_Vetor;

public class Teste09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adicionar("A"); // índice 0
        vetor.adicionar("B"); // índice 1
        vetor.adicionar("A"); // índice 2
        vetor.adicionar("C"); // índice 3

        System.out.println(vetor.indiceUltimo("A")); // Retorna 2
        System.out.println(vetor.indiceUltimo("B")); // Retorna 1
        System.out.println(vetor.indiceUltimo("Z")); // Retorna -1
    }
}
