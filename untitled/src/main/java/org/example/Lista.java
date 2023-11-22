package org.example;

public class Lista {
    private Produto inicio;

    public Lista() {
        this.inicio = null;
    }

    public void inicializarLista() {
        this.inicio = null;
    }

    public void inserirProdutoOrdenado(Produto novoProduto) {
        if (inicio == null) {
            inicio = novoProduto;
            novoProduto.setProximo(novoProduto);
            novoProduto.setAnterior(novoProduto);
            return;
        }

        Produto atual = inicio;

        while (atual.getProximo() != inicio && novoProduto.getNome().charAt(0) > atual.getNome().charAt(0)) {
            atual = atual.getProximo();
        }

        if (novoProduto.getNome().charAt(0) <= atual.getNome().charAt(0)) {
            novoProduto.setAnterior(atual.getAnterior());
            novoProduto.setProximo(atual);

            atual.getAnterior().setProximo(novoProduto);
            atual.setAnterior(novoProduto);

            if (novoProduto.getNome().charAt(0) <= inicio.getNome().charAt(0)) {
                inicio = novoProduto;
            }
        } else {
            novoProduto.setAnterior(atual);
            novoProduto.setProximo(atual.getProximo());

            atual.getProximo().setAnterior(novoProduto);
            atual.setProximo(novoProduto);
        }
    }

    public void excluirProduto(String nome) {
        if (inicio == null) {
            System.out.println("Lista vazia. Nada a excluir.");
            return;
        }

        Produto atual = inicio;

        while (!nome.equals(atual.getNome()) && atual.getProximo() != inicio) {
            atual = atual.getProximo();
        }

        if (nome.equals(atual.getNome())) {
            if (atual.getProximo() == atual) {
                inicio = null;
            } else {
                atual.getAnterior().setProximo(atual.getProximo());
                atual.getProximo().setAnterior(atual.getAnterior());

                if (atual == inicio) {
                    inicio = atual.getProximo();
                }
            }
            System.out.println("Produto excluído.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void consultarProduto(String nome) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Produto atual = inicio;

        while (!nome.equals(atual.getNome()) && atual.getProximo() != inicio) {
            atual = atual.getProximo();
        }

        if (nome.equals(atual.getNome())) {
            System.out.println("Produto encontrado:");
            System.out.println("Nome: " + atual.getNome());
            System.out.println("Preço: " + atual.getPreco());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void imprimirListaOrdenado() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Produto atual = inicio;

        System.out.println("---Produtos (do início ao fim):---");

        do {
            System.out.println("Nome: " + atual.getNome() + ", Preço: " + atual.getPreco());
            atual = atual.getProximo();
        } while (atual != inicio);
    }

    public void imprimirListaReverso() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Produto atual = inicio.getAnterior();

        System.out.println("---Produtos (do fim ao início):---");

        do {
            System.out.println("Nome: " + atual.getNome() + ", Preço: " + atual.getPreco());
            atual = atual.getAnterior();
        } while (atual != inicio.getAnterior());
    }
}
