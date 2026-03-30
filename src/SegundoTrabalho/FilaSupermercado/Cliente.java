package SegundoTrabalho.FilaSupermercado;

public class Cliente {
    private String nome;
    private int quantidadeDeProdutos;

    public Cliente(String nome, int quantidadeDeProdutos) {
        this.nome = nome;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }
}
