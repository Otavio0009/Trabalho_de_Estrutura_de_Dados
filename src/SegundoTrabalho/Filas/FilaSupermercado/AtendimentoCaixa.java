package SegundoTrabalho.Filas.FilaSupermercado;

public class AtendimentoCaixa {
    public static void main(String[] args) {
        Fila<Cliente> filaCaixa = new Fila<>(10);

        filaCaixa.insereElemento(new Cliente("Otávio", 9));
        filaCaixa.insereElemento(new Cliente("Maria", 20));
        filaCaixa.insereElemento(new Cliente("Pedro", 25));
        filaCaixa.insereElemento(new Cliente("Juan", 30));
        filaCaixa.insereElemento(new Cliente("Marcos", 10));

        System.out.println("=== Início do Expediente no Caixa ===\n");

        while (!filaCaixa.estaVasia()) {

            Cliente atual = filaCaixa.desenfileira();

            System.out.println("[ATENDIMENTO] Cliente: " + atual.getNome() +
                    " | Itens no carrinho: " + atual.getQuantidadeDeProdutos());

            int restantes = filaCaixa.tamanho();

            System.out.println(">> Clientes restantes na fila: " + restantes);
            System.out.println("--------------------------------------");
        }

        System.out.println("Caixa livre! Todos os clientes foram atendidos.");
    }
}
