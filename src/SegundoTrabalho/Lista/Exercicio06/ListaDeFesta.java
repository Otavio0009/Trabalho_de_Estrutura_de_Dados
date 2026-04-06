package SegundoTrabalho.Lista.Exercicio06;

import SegundoTrabalho.Lista.ListaEncadeada;

public class ListaDeFesta extends ListaEncadeada<Convidados> {
    public boolean contem(String nomeBuscado){
        for (int i = 0; i < getTamanho(); i++) {
            Convidados c = pegarElemento(i);
            if (c != null && c.getNome().equalsIgnoreCase(nomeBuscado)) {
                return true;
            }
        }
        return false;
    }
}
