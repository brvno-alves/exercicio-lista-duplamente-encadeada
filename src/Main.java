//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(3);
        lista.adicionar(2);
        lista.adicionar(1);
        lista.adicionar(4);
        lista.adicionar(2);

        System.out.print("Lista original: ");
        lista.imprimirLista();

        int valor = 2;
        ListaAnalise analise = lista.analisarLista(lista.getCabeca(), valor);

        System.out.println("Análise da lista para o valor " + valor + ":");
        System.out.println("Número total de nodos: " + analise.numeroTotalDeNodos);
        System.out.println("Número de nodos com valor igual a " + valor + ": " + analise.numeroDeNodosIguais);
        System.out.println("Posições dos nodos com valor igual a " + valor + ": " + analise.posicoes);
        System.out.println("Número de nodos com valor maior que " + valor + ": " + analise.numeroDeNodosMaiores);
    }
}
