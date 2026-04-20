package SegundoTrabalho.Recursao.OtimizacaoDeFibonacci;

import static SegundoTrabalho.Recursao.OtimizacaoDeFibonacci.Fibonacci.fibonacci;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Sequencia de fibonacci: " + fibonacci(i));
        }
    }
}
