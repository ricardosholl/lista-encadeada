class No {
    int dado;
    No proximo;

    No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

class ListaEncadeada {
    No inicio;

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);
        if (inicio == null || valor < inicio.dado) {
            novoNo.proximo = inicio;
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null && atual.proximo.dado < valor) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        }
    }

    public boolean remover(int valor) {
        if (inicio == null) {
            return false;
        }
        if (inicio.dado == valor) {
            inicio = inicio.proximo;
            return true;
        }
        No atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.dado == valor) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public No buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == valor) {
                return atual;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Teste de inserção ordenada
        lista.inserirOrdenado(5);
        lista.inserirOrdenado(3);
        lista.inserirOrdenado(7);
        lista.inserirOrdenado(1);
        lista.inserirOrdenado(9);

        System.out.println("Lista após inserções:");
        lista.imprimir();

        // Teste de busca
        No encontrado = lista.buscar(3);
        System.out.println("Busca por 3: " + (encontrado != null ? "Encontrado" : "Não encontrado"));

        // Teste de remoção
        boolean removido = lista.remover(3);
        System.out.println("Remoção de 3: " + (removido ? "Sucesso" : "Falha"));

        System.out.println("Lista após remoção:");
        lista.imprimir();
    }
}
