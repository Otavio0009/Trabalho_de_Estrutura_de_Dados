package SegundoTrabalho.Pilha;

public class Teste_02 {
    static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        String invertido = pilha.inverterPalavra("hello");
        System.out.println(invertido);


    }
}

