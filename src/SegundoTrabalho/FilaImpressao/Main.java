package SegundoTrabalho.FilaImpressao;

public class Main {
    public static void main(String[] args) {
        Fila<Documeto> doc = new Fila<>(10);

        doc.insereElemento(new Documeto("Livro de Java", 110)); // 1
        doc.insereElemento(new Documeto("Livro de Python", 80)); // 2
        doc.insereElemento(new Documeto("Livro de C", 130)); // 3
        doc.insereElemento(new Documeto("Livro de JavaScript", 90)); //4
        doc.insereElemento(new Documeto("Livro de C#", 100)); // 5

        while (!doc.estaVasia()) {
            Documeto docAtual = doc.desenfileira();
            System.out.println("Imprimindo o livro de: " + docAtual.getNome());
        }
    }
}
