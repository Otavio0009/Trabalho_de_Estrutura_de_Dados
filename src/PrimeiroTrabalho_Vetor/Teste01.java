package PrimeiroTrabalho_Vetor;

public class Teste01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");

        System.out.println("Tamanho: " + vetor.tamanho());
        System.out.println("PrimeiroTrabalho_Vetor.Vetor: " + vetor);
        System.out.println("Impreção um por um linha");
        vetor.imprimeUmPorLinha();
    }
}