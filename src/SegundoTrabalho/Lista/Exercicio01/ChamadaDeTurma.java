package SegundoTrabalho.Lista.Exercicio01;

import SegundoTrabalho.Lista.ListaEncadeada;

public class ChamadaDeTurma {
    static void main(String[] args) {
        ListaEncadeada<Aluno> lista = new ListaEncadeada<>();

        lista.adicionar(new Aluno("Otávio", "09"));
        lista.adicionar(new Aluno("Olívia", "08"));
        lista.adicionar(new Aluno("Osvaudo", "07"));
        lista.adicionar(new Aluno("Ofélia", "06"));
        lista.adicionar(new Aluno("Oceane", "05"));

        System.out.println("Lista de alunos:");
        System.out.println(lista);
        System.out.println();
        System.out.println("Primeiro aluno:" + lista.pegarPimeiroElemento());
        System.out.println("Utilmo aluno:" + lista.pegarUltimoElemento());

    }
}
