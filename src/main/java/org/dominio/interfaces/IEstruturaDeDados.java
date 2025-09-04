package org.dominio.interfaces;

public interface IEstruturaDeDados<T> {
    void adicionar(T valor);  // Insere um elemento
    T remover();              // Remove e retorna um elemento
    int tamanho();            // Retorna o número de elementos
    boolean estaVazia();      // Verifica se está vazia
}
