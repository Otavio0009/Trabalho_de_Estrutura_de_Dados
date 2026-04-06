package SegundoTrabalho.Lista.Exercicio09;

public class Disciplina {
    private String nome;
    private double notaFinal;

    public Disciplina(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + " | Nota: " + notaFinal;
    }
}
