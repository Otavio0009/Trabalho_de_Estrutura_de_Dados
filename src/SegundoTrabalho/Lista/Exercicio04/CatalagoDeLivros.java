package SegundoTrabalho.Lista.Exercicio04;

import SegundoTrabalho.Lista.ListaEncadeada;

public class CatalagoDeLivros {
    static void main(String[] args) {
        ListaEncadeada<Catalogo> meuCatalogo = new ListaEncadeada<>();

        meuCatalogo.adicionar(new Catalogo("Dom Casmurro", "Machado de Assis", 1899));
        meuCatalogo.adicionar(new Catalogo("O Hobbit", "J.R.R. Tolkien", 1937));
        meuCatalogo.adicionar(new Catalogo("1984", "George Orwell", 1949));
        meuCatalogo.adicionar(new Catalogo("A Hora da Estrela", "Clarice Lispector", 1977));
        meuCatalogo.adicionar(new Catalogo("O Alquimista", "Paulo Coelho", 1988));

        System.out.println(meuCatalogo);

        System.out.println("---");

        System.out.println("Primeiro livro cadastrado: " + meuCatalogo.pegarPimeiroElemento());

        System.out.println("---");

        System.out.println("Último livro cadastrado: " + meuCatalogo.pegarUltimoElemento());
    }
}
