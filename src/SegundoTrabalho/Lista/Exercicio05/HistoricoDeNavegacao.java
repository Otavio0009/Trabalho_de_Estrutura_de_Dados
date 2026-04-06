package SegundoTrabalho.Lista.Exercicio05;

import SegundoTrabalho.Lista.ListaEncadeada;

public class HistoricoDeNavegacao {
    static void main(String[] args) {
        ListaEncadeada<Historico> historico = new ListaEncadeada<>();

        historico.adicionar(new Historico("Google", "google.com"));
        historico.adicionar(new Historico("Youtube", "youtube.com"));
        historico.adicionar(new Historico("Facebook", "facebook.com"));
        historico.adicionar(new Historico("Twitter", "twitter.com"));
        historico.adicionar(new Historico("GitHub", "github.com"));
        historico.adicionar(new Historico("Instagram", "instagram.com"));
        historico.adicionar(new Historico("Whatsapp", "whatsapp.com"));
        historico.adicionar(new Historico("LinkedIn", "linkedin.com"));

        System.out.println(historico);

        System.out.println();
        System.out.println("Visitou GitHub? " + historico.contem("gihub.com"));
        System.out.println("Última página visitada: " + historico.pegarUltimoElemento());
        System.out.println("Total de páginas visitadas: " + historico.getTamanho());
    }
}
