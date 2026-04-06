package SegundoTrabalho.Lista.Exercicio03;

import SegundoTrabalho.Lista.ListaEncadeada;

public class ListaDeComprasEspecializada extends ListaEncadeada<Lista> {
    public boolean contem(String nomeBusca) {
        for (int i = 0; i < getTamanho(); i++) {
            Lista item = pegarElemento(i);
            if (item != null && item.getNomeDoProduto().equalsIgnoreCase(nomeBusca)) {
                return true;
            }
        }
        return false;
    }
}
