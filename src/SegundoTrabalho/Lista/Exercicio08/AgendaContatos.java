package SegundoTrabalho.Lista.Exercicio08;

import SegundoTrabalho.Lista.ListaEncadeada;

public class AgendaContatos {
    public static void main(String[] args) {
        ListaEncadeada<Contato> minhaAgenda = new ListaEncadeada<>();

        minhaAgenda.adicionar(new Contato("Ana Silva", "(11) 98888-0001"));
        minhaAgenda.adicionar(new Contato("Bruno Souza", "(11) 98888-0002"));
        minhaAgenda.adicionar(new Contato("Carla Dias", "(11) 98888-0003"));
        minhaAgenda.adicionar(new Contato("Daniel Vaz", "(11) 98888-0004"));
        minhaAgenda.adicionar(new Contato("Eduarda Lima", "(11) 98888-0005"));
        minhaAgenda.adicionar(new Contato("Felipe Rosa", "(11) 98888-0006"));

        System.out.println("--- MINHA AGENDA ---");
        System.out.println(minhaAgenda);
        System.out.println("--------------------");
        String busca = "Carla Dias";
        boolean cadastrado = false;

        for (int i = 0; i < minhaAgenda.getTamanho(); i++) {
            Contato c = minhaAgenda.pegarElemento(i);
            if (c != null && c.getNome().equalsIgnoreCase(busca)) {
                cadastrado = true;
                break;
            }
        }

        if (cadastrado) {
            System.out.println("O contato '" + busca + "' está cadastrado na agenda.");
        } else {
            System.out.println("O contato '" + busca + "' não foi encontrado.");
        }

        System.out.println("Total de contatos na agenda: " + minhaAgenda.getTamanho());
    }
}