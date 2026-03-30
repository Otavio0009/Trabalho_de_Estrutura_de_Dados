package SegundoTrabalho.Filas.FilaImpressao;

public class Documeto extends Fila<Documeto>{
    private String nome;
    private int numeroDePaginas;

    public Documeto(String nome, int numeroDePaginas) {
        super(numeroDePaginas);
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return nome + " (" + numeroDePaginas + "p)";
    }
}
