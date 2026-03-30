package SegundoTrabalho.Filas.FilaSupermercado;

public class Fila<T> {
    private int tamanho;
    private T[] elementos;

    public Fila(int capacidade) {
        this.tamanho = 0;
        this.elementos = (T[]) new Object[capacidade];
    }

    public int tamanho()  {
        return tamanho;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novoElementos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                novoElementos[i] = this.elementos[i];
            }

            this.elementos = novoElementos;
        }
    }

    public boolean estaVasia() {
        return this.tamanho == 0;
    }

    public void insereElemento(T elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T espiar() {
        if(this.estaVasia()) {
            return null;
        }
        return this.elementos[0];
    }

    public  T desenfileira() {

        if (this.estaVasia()) {
            return null;
        }

        T elementoRemovido = this.elementos[0];

        for (int i = 0; i < this.tamanho -1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;

        return elementoRemovido;
    }
}

