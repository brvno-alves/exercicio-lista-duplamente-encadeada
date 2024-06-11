import java.util.List;

public class ListaAnalise {
    int numeroTotalDeNodos;
    int numeroDeNodosIguais;
    int numeroDeNodosMaiores;
    List<Integer> posicoes;

    public ListaAnalise(int numeroTotalDeNodos, int numeroDeNodosIguais, int numeroDeNodosMaiores, List<Integer> posicoes) {
        this.numeroTotalDeNodos = numeroTotalDeNodos;
        this.numeroDeNodosIguais = numeroDeNodosIguais;
        this.numeroDeNodosMaiores = numeroDeNodosMaiores;
        this.posicoes = posicoes;
    }
}
