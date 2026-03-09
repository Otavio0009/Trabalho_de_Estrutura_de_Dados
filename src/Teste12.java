public class Teste12 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println("Antes:  " + vetor);
        vetor.inserirDepois("A", "B");

        System.out.println("Depois: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());
    }
}
