package SegundoTrabalho.Lista.Exercicio07;

import SegundoTrabalho.Lista.ListaEncadeada;

public class SimuladorDeEstoque {
    public static void main(String[] args) {
        ListaEncadeada<Produto> estoque = new ListaEncadeada<>();

        estoque.adicionar(new Produto("Teclado Mecânico", 250.00, 15));
        estoque.adicionar(new Produto("Mouse Gamer", 120.00, 20));
        estoque.adicionar(new Produto("Monitor 24'", 900.00, 8));
        estoque.adicionar(new Produto("Headset", 180.00, 12));
        estoque.adicionar(new Produto("Mousepad XL", 60.00, 30));

        System.out.println("--- PRODUTOS EM ESTOQUE ---");
        System.out.println(estoque);
        System.out.println("---------------------------\n");

        int posicaoBusca = 2;
        System.out.println("Produto na posição " + posicaoBusca + ": " + estoque.pegarElemento(posicaoBusca - 1));

        String nomeParaBuscar = "Monitor 24'";
        boolean existe = false;

        for (int i = 0; i < estoque.getTamanho(); i++) {
            Produto p = estoque.pegarElemento(i);
            if (p != null && p.getNome().equalsIgnoreCase(nomeParaBuscar)) {
                existe = true;
                break;
            }
        }

        System.out.println("Verificando existência de '" + nomeParaBuscar + "': " + (existe ? "Sim, em estoque." : "Não encontrado."));

        System.out.println("Primeiro cadastrado: " + estoque.pegarElemento(0));
        System.out.println("Último cadastrado: " + estoque.pegarElemento(estoque.getTamanho() - 1));
    }
}
