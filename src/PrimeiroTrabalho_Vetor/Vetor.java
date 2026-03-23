package PrimeiroTrabalho_Vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public String ultimo() {
        if (this.estaVazia()) {
            throw new IllegalStateException("O vetor está vazio");
        }
        return this.elementos[this.tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {

            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionar(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;

            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String buscar(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder conteudo = new StringBuilder();
        conteudo.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            conteudo.append(this.elementos[i]);
            conteudo.append(", ");
        }

        conteudo.append(this.elementos[this.tamanho - 1]);
        conteudo.append("]");
        return conteudo.toString();
    }

    public void limpar() {
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    public int contarOcorrencias(String elemento) {
        int contador = 0;

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean substituir(String antigo, String novo){
        for(int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(antigo) && antigo != novo){

                this.elementos[i] = novo;
                return true;
            }
        }
        return false;
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho -1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
    }

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(String elemento) {
        int posicao = this.busca(elemento);

        if (posicao == -1) {
            return false;
        }

        this.remover(posicao);
        return true;
    }

    public int indiceUltimo(String elemento) {
        for (int i = this.tamanho - 1; i >= 0; i--) {

            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void removerTodos(String elemento) {
        while(this.remover(elemento)){}
    }

    public boolean adicionaraSeNaoExistente(String elemento) {
        if (this.contem(elemento)) {
            return false;
        }
        return this.adicionar(elemento);
    }

    public boolean inserirDepois(String referencia,  String novoElemento) {
        int posicao = this.busca(referencia);

        if (posicao == -1 || this.tamanho >= this.elementos.length) {
            return false;
        }

        int indiceInsercao = posicao + 1;

        for (int i = this.tamanho - 1; i >= indiceInsercao; i--) {
            this.elementos[i+1] =  this.elementos[i];
        }

        this.elementos[indiceInsercao] = novoElemento;
        this.tamanho++;

        return true;
    }

}
