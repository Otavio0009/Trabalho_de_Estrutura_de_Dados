package SegundoTrabalho.AgendamentoDeTarefasDoSistema;

public class Tarefa {
    private String nome;
    private int prioridade; // 1: Alta, 2: Média, 3: Baixa

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() { return nome; }
    public int getPrioridade() { return prioridade; }

    @Override
    public String toString() {
        return "[Prio: " + prioridade + "] " + nome;
    }
}
