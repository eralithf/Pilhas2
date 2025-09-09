package org.pilhas_encadeadas;

public class PilhaEncadeada<T> {
    private No<T> topo;

    public void push(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.setProximo(this.topo);
        this.topo = novoNo;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        T dado = this.topo.getDado();
        this.topo = this.topo.getProximo();
        return dado;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return this.topo.getDado();
    }

    public boolean isEmpty() {
        return this.topo == null;
    }
}

