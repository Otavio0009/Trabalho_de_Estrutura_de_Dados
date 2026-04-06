package SegundoTrabalho.Lista.Exercicio04;

public class Catalogo {
    private String titulo;
    private String autor;
    private int ano;

    public Catalogo(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Catalogo{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", ano=").append(ano);
        sb.append('}');
        return sb.toString();
    }
}
