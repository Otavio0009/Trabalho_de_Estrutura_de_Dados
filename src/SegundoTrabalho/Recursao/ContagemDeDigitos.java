package SegundoTrabalho.Recursao;

import static SegundoTrabalho.Recursao.Recursao.digitos;

public class ContagemDeDigitos {
    public static void main(String[] args) {
        int numero = 12345;

        System.out.println("Número: " + numero);
        System.out.println("Quantidade total de digitos dentro desse número: " + digitos(numero));
    }
}
