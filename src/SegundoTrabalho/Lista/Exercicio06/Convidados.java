package SegundoTrabalho.Lista.Exercicio06;

import SegundoTrabalho.Lista.ListaEncadeada;


public class Convidados {
    private String nome;
    private String cpf;

    public Convidados(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String CPF) {
        this.cpf = CPF;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return this.nome.equalsIgnoreCase((String) obj);
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Convidados{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", CPF='").append(cpf).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
