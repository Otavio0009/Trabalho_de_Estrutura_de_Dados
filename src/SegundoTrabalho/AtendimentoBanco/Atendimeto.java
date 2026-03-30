package SegundoTrabalho.AtendimentoBanco;

public class Atendimeto {
    public static void main(String[] args) {
        Fila<Cliente> cliente = new Fila<>(6);

        cliente.insereElemento(new Cliente("Otávio", 80906));
        cliente.insereElemento(new Cliente("Maria", 95600));
        cliente.insereElemento(new Cliente("Pedro", 684400));
        cliente.insereElemento(new Cliente("Juan", 95623));
        cliente.insereElemento(new Cliente("Mario", 60945));
        cliente.insereElemento(new Cliente("Pietra", 889060));

        System.out.println("=== Início do Atendimento Bancário ===\n");

        while (!cliente.estaVasia()) {
            Cliente client = cliente.desenfileira();
            System.out.println("Chamando Senha: " + client.getNumeroDaSenha() + " -Cliente: " + client.getNome());
        }

        System.out.println("\n--------------------------------------");
        System.out.println("Aviso: Todos os clientes foram atendidos.");
        System.out.println("Estado da Fila: Vazia.");
    }
}
