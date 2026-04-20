package SegundoTrabalho.Recursao;

import static SegundoTrabalho.Recursao.Recursao.bucarMaiorElemento;

public class MaiorElementoDeUmArray {
    static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 3;
        numeros[1] = 9;
        numeros[2] = 2;
        numeros[3] = 15;
        numeros[4] = 7;

        System.out.println(bucarMaiorElemento(numeros));
    }
}
