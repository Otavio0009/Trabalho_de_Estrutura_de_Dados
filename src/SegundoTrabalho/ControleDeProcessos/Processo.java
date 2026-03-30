package SegundoTrabalho.ControleDeProcessos;

public class Processo {
    private String identificador;
    private int tempoExecucao; // em segundos ou ms

    public Processo(String identificador, int tempoExecucao) {
        this.identificador = identificador;
        this.tempoExecucao = tempoExecucao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    @Override
    public String toString() {
        return "ID: " + identificador + " | Duração: " + tempoExecucao + "s";
    }
}