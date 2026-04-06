package SegundoTrabalho.Lista.Exercicio02;

import SegundoTrabalho.Lista.ListaEncadeada;

public class PlaylistMusical {
    public static void main(String[] args) {
        ListaEncadeada<Musica> playList = new ListaEncadeada<>();

        playList.adicionar(new Musica("Bohemian Rhapsody", "Queen"));
        playList.adicionar(new Musica("Stand By Me", "Ben E. King"));
        playList.adicionar(new Musica(" Asa Branca", "Luiz Gonzaga"));
        playList.adicionar(new Musica("Smoot Criminal", "Michael Jackson"));
        playList.adicionar(new Musica("Seis Cordas", "Luiz Fidelis"));
        playList.adicionar(new Musica("Tocando em Frente", "Almir Sater"));

        String buscar = "Seis Cordas";

        if(playList.contem(buscar)){
            System.out.println("Musica encontrada: " +  buscar);
        } else {
            System.out.println("Não encontramos");
        }

        System.out.println("Total de Musicas na Playlist: " + playList.toString());
    }
}
