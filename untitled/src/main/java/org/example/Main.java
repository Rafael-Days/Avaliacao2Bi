package org.example;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Produto produto1 = new Produto("ProdutoC", 30.0f);
        Produto produto2 = new Produto("ProdutoA", 20.0f);
        Produto produto3 = new Produto("ProdutoB", 25.0f);

        lista.inserirProdutoOrdenado(produto1);
        lista.inserirProdutoOrdenado(produto2);
        lista.inserirProdutoOrdenado(produto3);

        lista.imprimirListaOrdenado();
        //lista.imprimirListaReverso();

        //lista.excluirProduto("ProdutoA");

        //lista.imprimirListaOrdenado();

        //lista.inicializarLista();

        //lista.consultarProduto("ProdutoC");
    }
}