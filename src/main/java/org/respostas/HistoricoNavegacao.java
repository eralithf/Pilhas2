
package org.respostas;

import org.dominio.Pilha;
import java.util.Scanner;

public class HistoricoNavegacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>(10); // Pilha de inteiros

        while (true) {
            System.out.print("Digite o número do site (ou VOLTAR / SAIR): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("SAIR")) break;

            if (entrada.equalsIgnoreCase("VOLTAR")) {
                if (!pilha.estaVazia()) {
                    System.out.println("Voltando de: " + pilha.remover());
                } else {
                    System.out.println("Histórico vazio.");
                }
            } else {
                try {
                    int site = Integer.parseInt(entrada);
                    pilha.adicionar(site);
                    System.out.println("Acessando site: " + site);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número ou comandos válidos.");
                }
            }
        }
        sc.close();
    }
}
