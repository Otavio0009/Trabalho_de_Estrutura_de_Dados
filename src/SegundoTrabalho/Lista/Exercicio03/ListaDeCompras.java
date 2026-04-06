package SegundoTrabalho.Lista.Exercicio03;

import SegundoTrabalho.Lista.ListaEncadeada;

public class ListaDeCompras {
    static void main(String[] args) {
        ListaEncadeada<Lista> lista = new ListaEncadeada<>();

        lista.adicionar(new Lista("Arroz", 2));
        lista.adicionar(new Lista("Feijão", 3));
        lista.adicionar(new Lista("Leite", 12));
        lista.adicionar(new Lista("Café", 1));
        lista.adicionar(new Lista("Açúcar", 2));
        lista.adicionar(new Lista("Pão", 10));
        lista.adicionar(new Lista("Manteiga", 1));

        System.out.println(lista);
        int pos = 3;
        System.out.println("Item na posição " + pos + ": " + lista.pegarElemento(pos));

        String busca = "Café";
        boolean encontrado = false;

        for (int i = 0; i < lista.getTamanho(); i++) {
            Lista itemAtual = lista.pegarElemento(i);

            if (itemAtual != null && itemAtual.getNomeDoProduto().equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O item '" + busca + "' já está no carrinho.");
        } else {
            System.out.println("O item '" + busca + "' não foi encontrado.");
        }

        System.out.println("Total de itens na lista: " + lista.getTamanho());
    }
}
