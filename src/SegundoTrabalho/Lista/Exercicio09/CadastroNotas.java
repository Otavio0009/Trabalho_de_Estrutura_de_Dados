package SegundoTrabalho.Lista.Exercicio09;

import SegundoTrabalho.Lista.ListaEncadeada;

public class CadastroNotas {
    public static void main(String[] args) {
        ListaEncadeada<Disciplina> boletim = new ListaEncadeada<>();

        boletim.adicionar(new Disciplina("Matemática", 8.5));
        boletim.adicionar(new Disciplina("Estrutura de Dados", 9.0));
        boletim.adicionar(new Disciplina("Algoritmos", 10.0));
        boletim.adicionar(new Disciplina("Banco de Dados", 7.5));
        boletim.adicionar(new Disciplina("Sistemas Operacionais", 8.0));

        System.out.println(boletim);

        int posicaoParaVer = 2;
        Disciplina dPosicao = boletim.pegarElemento(posicaoParaVer - 1);
        System.out.println("Disciplina na posição " + posicaoParaVer + ": " + dPosicao);

        String busca = "Algoritmos";
        boolean cadastrada = false;

        for (int i = 0; i < boletim.getTamanho(); i++) {
            Disciplina d = boletim.pegarElemento(i);
            if (d != null && d.getNome().equalsIgnoreCase(busca)) {
                cadastrada = true;
                break;
            }
        }

        System.out.println("Busca por '" + busca + "': " + (cadastrada ? "Encontrada" : "Não encontrada"));

        System.out.println("Total de registros no boletim: " + boletim.getTamanho());
    }
}