package SegundoTrabalho.AtendimentoBanco;


public class Cliente {
    private String nome;
    private int numeroDaSenha;

    public Cliente(String nome, int numeroDaSenha) {
        this.nome = nome;
        this.numeroDaSenha = numeroDaSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDaSenha() {
        return numeroDaSenha;
    }

    public void setNumeroDaSenha(int numeroDaSenha) {
        this.numeroDaSenha = numeroDaSenha;
    }
}
