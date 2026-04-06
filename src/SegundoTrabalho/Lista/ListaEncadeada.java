package SegundoTrabalho.Lista;

public class ListaEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.primeiro = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
            this.ultimo = celula;
        }
        this.tamanho++;
    }

    public T pegarPimeiroElemento() {
        if (this.primeiro != null) {
            return this.primeiro.getElemento();
        } else {
            return null;
        }
    }

    public T pegarUltimoElemento() {
        if (this.ultimo != null) {
            return this.ultimo.getElemento();
        }
        return null;
    }

    public boolean contem(Object elemento) {
        No<T> elementoAtual = this.primeiro;

        while (elementoAtual!= null) {
            if  (elementoAtual.getElemento().equals(elemento)) {
                return true;
            }

            elementoAtual = elementoAtual.getProximo();
        }
        return false;
    }

    public T pegarElemento(int posicao) {
        if (posicao< 0 || posicao >= this.tamanho) {
            return null;
        }

        No<T> elementoAtual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            elementoAtual = elementoAtual.getProximo();
        }

        return elementoAtual.getElemento();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        if (this.tamanho == 0) {
            return "[Tamanho= " + this.tamanho + "]";
        }

        No<T> atual = this.primeiro;

        for (int i = 0; i < this.tamanho -1; i++) {
            sb.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        sb.append(atual.getElemento());
        sb.append(": Tamanho= ").append(this.tamanho);
        sb.append("]");

        return sb.toString();
    }
}
