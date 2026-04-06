package SegundoTrabalho.Lista.Exercicio03;

public class Lista {
    private String nomeDoProduto;
    private int quantidade;

    public Lista(String nomeDoProduto, int quantidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidade = quantidade;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lista{");
        sb.append("nomeDoProduto='").append(nomeDoProduto).append('\'');
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
}
