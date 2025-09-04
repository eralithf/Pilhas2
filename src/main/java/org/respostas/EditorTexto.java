package org.respostas;

import org.dominio.Pilha;
import java.util.Scanner;

public class EditorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Character> pilha = new Pilha<>(100); // Pilha de caracteres

        while (true) {
            System.out.print("Digite um caractere (ou BACKSPACE / ENTER): ");
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("ENTER")) {

                StringBuilder texto = new StringBuilder();
                while (!pilha.estaVazia()) {
                    texto.insert(0, pilha.remover());
                }
                System.out.println("Texto final: " + texto);
                break;
            }

            if (entrada.equalsIgnoreCase("BACKSPACE")) {
                if (!pilha.estaVazia()) {
                    pilha.remover();
                    System.out.println("Último caractere removido.");
                } else {
                    System.out.println("Nada para remover.");
                }
            } else if (entrada.length() == 1) {
                pilha.adicionar(entrada.charAt(0));
            } else {
                System.out.println("Entrada inválida! Digite apenas um caractere ou comandos válidos.");
            }
        }
        sc.close();
    }
}
