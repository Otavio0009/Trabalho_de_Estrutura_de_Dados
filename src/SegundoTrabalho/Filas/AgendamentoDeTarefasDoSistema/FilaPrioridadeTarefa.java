package SegundoTrabalho.Filas.AgendamentoDeTarefasDoSistema;

public class FilaPrioridadeTarefa<T> extends Fila<T> {
    public FilaPrioridadeTarefa(int capacidade) {
        super(capacidade);
    }

    public void adicionarTarefa(T elemento) {
        Tarefa novaTarefa = (Tarefa) elemento;

        if (this.estaVasia()) {
            this.insereElemento(elemento);
            return;
        }

        // Procura a posição correta (onde a prioridade é maior que a da nova tarefa)
        int i;
        for (i = 0; i < this.tamanho(); i++) {
            Tarefa tFila = (Tarefa) this.busca(i);
            if (novaTarefa.getPrioridade() < tFila.getPrioridade()) {
                break;
            }
        }
        this.insere(i, elemento); // Insere no meio ou no fim, mantendo a ordem
    }
}