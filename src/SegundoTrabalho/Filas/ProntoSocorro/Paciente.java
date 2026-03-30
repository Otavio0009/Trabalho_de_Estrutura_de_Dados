package SegundoTrabalho.Filas.ProntoSocorro;

public class Paciente {
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        String pStr = (prioridade == 1) ? "URGENTE" : (prioridade == 2 ? "MÉDIA" : "BAIXA");
        return "[" + pStr + "] " + nome;
    }
}
