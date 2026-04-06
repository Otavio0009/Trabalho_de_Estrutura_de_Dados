package SegundoTrabalho.Lista.Exercicio06;


public class ListaDeConvidados {
    public static void main(String[] args) {
        ListaDeFesta festa = new ListaDeFesta();

        festa.adicionar(new Convidados("Otávio", "111.444.666-00"));
        festa.adicionar(new Convidados("Olívia", "111.222.000.09"));
        festa.adicionar(new Convidados("Osvaldo", "222.111.060.90"));
        festa.adicionar(new Convidados("Oceane", "333.222.444.08"));
        festa.adicionar(new Convidados("Oliver", "444.333.444.08"));
        festa.adicionar(new Convidados("Ofélia", "555.555.555.55"));

        System.out.println(festa);

        String busca = "Otávio";

        if (festa.contem(busca)) {
            System.out.println("Resultado da Busca: " + busca + " encontrado!");
        } else {
            System.out.println("Resultado da Busca: " +  busca + ", não encontrado!");
        }

        System.out.println("Total de convidados: " + festa.getTamanho());
    }
}