package SegundoTrabalho.Lista.Exercicio05;

public class Historico {
    private String tituloDaPagina;
    private String enderecoDoSite;

    public Historico(String tituloDaPagina, String enderecoDoSite) {
        this.tituloDaPagina = tituloDaPagina;
        this.enderecoDoSite = enderecoDoSite;
    }

    public String getTituloDaPagina() {
        return tituloDaPagina;
    }

    public void setTituloDaPagina(String tituloDaPagina) {
        this.tituloDaPagina = tituloDaPagina;
    }

    public String getEnderecoDoSite() {
        return enderecoDoSite;
    }

    public void setEnderecoDoSite(String enderecoDoSite) {
        this.enderecoDoSite = enderecoDoSite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Historico{");
        sb.append("tituloDaPagina='").append(tituloDaPagina).append('\'');
        sb.append(", enderecoDoSite='").append(enderecoDoSite).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
