import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

    private Nodo cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public Nodo getCabeca() {
        return this.cabeca;
    }

    public void adicionar(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (this.cabeca == null) {
            this.cabeca = novoNodo;
        } else {
            Nodo atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
    }

    public void imprimirLista() {
        Nodo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public ListaAnalise analisarLista(Nodo cabeca, int valor) {
        int numeroTotalDeNodos = 0;
        int numeroDeNodosIguais = 0;
        int numeroDeNodosMaiores = 0;
        List<Integer> posicoes = new ArrayList<>();

        Nodo atual = cabeca;
        int posicao = 0;

        while (atual != null) {
            numeroTotalDeNodos++;
            if (atual.dado == valor) {
                numeroDeNodosIguais++;
                posicoes.add(posicao);
            }
            if (atual.dado > valor) {
                numeroDeNodosMaiores++;
            }
            atual = atual.proximo;
            posicao++;
        }

        return new ListaAnalise(numeroTotalDeNodos, numeroDeNodosIguais, numeroDeNodosMaiores, posicoes);
    }
}
