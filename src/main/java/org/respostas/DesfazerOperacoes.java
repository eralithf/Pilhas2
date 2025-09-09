package org.respostas;

import org.dominio.Pilha;

import java.util.Scanner;

public class DesfazerOperacoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha<Integer> comandos = new Pilha<>(10);
        String entrada = "";

        System.out.println("Simulador de Undo. Digite um número de comando ou 'DESFAZER' / 'SAIR'.");

        while (!entrada.equalsIgnoreCase("SAIR")) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("DESFAZER")) {
                if (!comandos.estaVazia()) {
                    int comandoDesfeito = comandos.remover();
                    System.out.println("Comando desfeito: " + comandoDesfeito);
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else if (!entrada.equalsIgnoreCase("SAIR")) {
                try {
                    int comando = Integer.parseInt(entrada);
                    comandos.adicionar(comando);
                    System.out.println("Comando armazenado: " + comando);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número, 'DESFAZER' ou 'SAIR'.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}