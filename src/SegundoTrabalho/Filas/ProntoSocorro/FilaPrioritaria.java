package SegundoTrabalho.Filas.ProntoSocorro;

public class FilaPrioritaria<T> extends Fila<T> {
    public FilaPrioritaria(int capacidade) {
        super(capacidade);
    }

    public void enfileiraPrioridade(T elemento) {
        Paciente paciente = (Paciente) elemento;

        if (this.estaVasia()) {
            this.insereElemento(elemento);
            return;
        }

        int i;
        for (i = 0; i < this.tamanho(); i++) {
            Paciente pFila = (Paciente) this.busca(i);
            if (paciente.getPrioridade() < pFila.getPrioridade()) {
                break;
            }
        }

        this.insere(i, elemento);
    }
}