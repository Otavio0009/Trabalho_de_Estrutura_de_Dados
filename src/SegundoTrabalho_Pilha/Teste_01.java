package SegundoTrabalho_Pilha;

public class Teste_01 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");

        System.out.println(pilha.toString());

        System.out.println(pilha.topo());
        System.out.println(pilha.desempilhar());
        System.out.println(pilha.topo());

        System.out.println(pilha.toString());
    }
}

