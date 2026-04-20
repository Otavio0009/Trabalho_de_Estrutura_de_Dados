package SegundoTrabalho.Recursao;

public class Recursao {
    public static String inversao(String string) {

        return inversaoRecursiva(string.toCharArray(), string.length() -1);
    }

    private static String inversaoRecursiva(char[] caracteres, int posicao) {
        if (posicao < 0) return "";

        return caracteres[posicao] + inversaoRecursiva( caracteres, posicao - 1);
    }

    public static boolean palindromo(String string) {

        if (string == null) return false;
        if (string.isEmpty()) return true;

        char[] letras = string.toCharArray();

        return palindromoRecursivo(letras, 0, letras.length - 1);
    }

    private static boolean palindromoRecursivo(char[] letras, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (letras[inicio] != letras[fim]) return false;

        return palindromoRecursivo(letras, inicio + 1, fim - 1);
    }

    public static int somar(int[] vetor) {
        return somarRecursivo(vetor, 0);
    }

    private static int somarRecursivo(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        }

        return vetor[indice] + somarRecursivo(vetor, indice + 1);
    }

    public static int bucarMaiorElemento(int[] vetor) {
        return encotrarMaiorElemento(vetor, 0);
    }

    private static int encotrarMaiorElemento(int[] vetor, int indice) {
        if (indice == vetor.length -1) return vetor[indice];

        int maior = encotrarMaiorElemento(vetor, indice + 1);

        if (vetor[indice] > maior) return vetor[indice];
        else return maior;
    }

    public static int digitos(int numero) {
        if (numero < 10) return 1;

        return 1 + digitos(numero / 10);
    }
}
