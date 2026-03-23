package PrimeiroTrabalho_Vetor;

public class Teste11 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println("Elementos já existentes: " + vetor);

        vetor.adicionaraSeNaoExistente("B");
        vetor.adicionaraSeNaoExistente("C");
        vetor.adicionaraSeNaoExistente("E");
        vetor.adicionaraSeNaoExistente("F");

        System.out.println("Elemntor que foram adicionados: " + vetor);
    }
}
