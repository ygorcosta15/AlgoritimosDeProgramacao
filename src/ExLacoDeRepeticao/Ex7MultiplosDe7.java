/*
 Escreva um programa que imprima
todos os múltiplos de 7 menores
que 200. Use o laço WHILE .
 */
package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex7MultiplosDe7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = 200;

        while (x >= 0) {
            x = x - 7;
            System.out.println("Saida:  " + x);
        }
    }
}
