public class Teste10 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C"); // Repetido
        vetor.adicionar("B");
        vetor.adicionar("D"); // Repetido
        vetor.adicionar("B");

        System.out.println("Antes de remover todos os elementos repetidos: " + vetor);
        System.out.println("Antogo tamanho: " + vetor.tamanho());

        vetor.removerTodos("B");

        System.out.println("Depois de remover todos os repetidos: " + vetor);
        System.out.println("Novo tamanho: " + vetor.tamanho());
    }
}
