package org.pilhas_encadeadas;

import java.util.Scanner;

public class BalanceamentoParenteses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma expressão para verificar o balanceamento de parênteses:");
        String expressao = scanner.nextLine();

        PilhaEncadeada<Character> pilha = new PilhaEncadeada<>();
        boolean balanceada = true;

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    balanceada = false;
                    break;
                }
                pilha.pop();
            }
        }

        if (balanceada && pilha.isEmpty()) {
            System.out.println("A expressão está balanceada.");
        } else {
            System.out.println("A expressão NÃO está balanceada.");
        }

        scanner.close();
    }
}