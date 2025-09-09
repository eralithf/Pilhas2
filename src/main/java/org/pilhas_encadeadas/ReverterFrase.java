package org.pilhas_encadeadas;

import java.util.Scanner;

public class ReverterFrase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();

        System.out.println("Digite uma frase para ser invertida:");
        String fraseOriginal = scanner.nextLine();

        for (int i = 0; i < fraseOriginal.length(); i++) {
            pilha.push(fraseOriginal.charAt(i));
        }

        StringBuilder fraseInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            fraseInvertida.append(pilha.pop());
        }

        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase invertida: " + fraseInvertida.toString());

        scanner.close();
    }
}