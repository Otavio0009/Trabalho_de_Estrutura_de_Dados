package PrimeiroTrabalho_Vetor;

public class Teste08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");

        /*vetor.remover("X");
        System.out.println(vetor);*/

        vetor.remover("B");
        System.out.println(vetor);
    }
}
