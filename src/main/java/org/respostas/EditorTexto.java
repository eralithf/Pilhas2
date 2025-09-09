package org.respostas;

import org.dominio.Pilha;


import java.util.Scanner;

public class EditorTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Character> textoPilha = new Pilha<>(100);
        String entrada = "";

        System.out.println("Editor de Texto. Digite um caractere, 'BACKSPACE' ou 'ENTER'.");

        while (!entrada.equalsIgnoreCase("ENTER")) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("BACKSPACE")) {
                if (!textoPilha.estaVazia()) {
                    textoPilha.remover();
                    System.out.println("Último caractere removido.");
                } else {
                    System.out.println("Nada para remover.");
                }
            } else if (!entrada.equalsIgnoreCase("ENTER")) {
                if (entrada.length() == 1) {
                    textoPilha.adicionar(entrada.charAt(0));
                } else {
                    System.out.println("Entrada inválida. Digite apenas um caractere, 'BACKSPACE' ou 'ENTER'.");
                }
            }
        }

        StringBuilder textoFinal = new StringBuilder();
        while (!textoPilha.estaVazia()) {
            textoFinal.insert(0, textoPilha.remover());
        }

        System.out.println("Texto final: " + textoFinal.toString());
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}