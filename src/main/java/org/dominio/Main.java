package org.dominio;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra para inverter:");
        String palavra = sc.nextLine();

        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.adicionar(palavra.charAt(i));
        }

        String invertida = "";
        while (!pilha.estaVazia()) {
            invertida += String.valueOf(pilha.remover()); //corrige a conversão para String
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + invertida);

        if (palavra.equals(invertida)) {
            System.out.println("Palíndromo identificado!");
        } else {
            System.out.println("Palíndromo não identificado!");
        }

        sc.close();
    }
}
