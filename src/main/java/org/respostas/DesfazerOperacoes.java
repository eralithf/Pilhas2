package org.respostas;

import org.dominio.Pilha;
import java.util.Scanner;

public class DesfazerOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>(10); // Pilha de inteiros

        while (true) {
            System.out.print("Digite um comando (ou DESFAZER / SAIR): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("SAIR")) break;

            if (entrada.equalsIgnoreCase("DESFAZER")) {
                if (!pilha.estaVazia()) {
                    System.out.println("Comando desfeito: " + pilha.remover());
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else {
                try {
                    int comando = Integer.parseInt(entrada);
                    pilha.adicionar(comando);
                    System.out.println("Comando armazenado: " + comando);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número ou comandos válidos.");
                }
            }
        }
        sc.close();
    }
}
