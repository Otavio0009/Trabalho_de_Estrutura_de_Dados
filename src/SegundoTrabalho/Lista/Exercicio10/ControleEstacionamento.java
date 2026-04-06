package SegundoTrabalho.Lista.Exercicio10;

import SegundoTrabalho.Lista.ListaEncadeada;

public class ControleEstacionamento {
    public static void main(String[] args) {
        ListaEncadeada<Carro> patio = new ListaEncadeada<>();

        patio.adicionar(new Carro("ABC-1234", "Fusca"));
        patio.adicionar(new Carro("XYZ-5678", "Civic"));
        patio.adicionar(new Carro("KLT-9090", "Uno"));
        patio.adicionar(new Carro("JHG-1122", "Corolla"));
        patio.adicionar(new Carro("OOO-0001", "Tesla Model 3"));

        System.out.println(patio);

        String placaBusca = "KLT-9090";
        boolean encontrado = false;

        for (int i = 0; i < patio.getTamanho(); i++) {
            Carro c = patio.pegarElemento(i);
            if (c != null && c.getPlaca().equalsIgnoreCase(placaBusca)) {
                encontrado = true;
                break;
            }
        }

        System.out.println("Busca pela placa [" + placaBusca + "]: " + (encontrado ? "Está no pátio." : "Não encontrado."));

        if (patio.getTamanho() > 0) {
            System.out.println("Primeiro carro a entrar: " + patio.pegarElemento(0));
            System.out.println("Último carro a entrar: " + patio.pegarElemento(patio.getTamanho() - 1));
        }

        System.out.println("Total de veículos: " + patio.getTamanho());
    }
}