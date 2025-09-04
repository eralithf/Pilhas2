package org.dominio;

import org.dominio.interfaces.IEstruturaDeDados;


public class Pilha<T> implements IEstruturaDeDados<T> {
    private T[] elementos;
    private int topo;
    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.topo = -1;
    }


    @Override
    public void adicionar(T valor) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("A pilha está cheia!");
        }
        elementos[++topo] = valor;
    }


    @Override
    public T remover() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return elementos[topo--];
    }


    @Override
    public int tamanho() {
        return topo + 1;
    }


    @Override
    public boolean estaVazia() {
        return topo == -1;
    }


    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return elementos[topo];
    }
}
