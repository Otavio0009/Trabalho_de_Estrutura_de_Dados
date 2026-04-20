package SegundoTrabalho.Recursao;

import static SegundoTrabalho.Recursao.Recursao.somar;

public class SomaDosElementosDeUmArray {
    public static void main(String[] args) {
        int[] vetor = new int[4];

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;

        System.out.println(somar(vetor));
    }
}
