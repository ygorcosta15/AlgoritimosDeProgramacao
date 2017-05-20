/*
Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
menor dentre os três números.
 */
package Lista4Funcao;

import java.util.Scanner;

public class Ex1SomaTresNumeros {

    public static void main(String[] args) {

        entradas();

    }

    public static void entradas() {
        Scanner leitor = new Scanner(System.in);

        int a, b, c;

        System.out.println("Número 1: ");
        a = leitor.nextInt();
        System.out.println("\nNúmero 2: ");
        b = leitor.nextInt();
        System.out.println("\nNúmero 3: ");
        c = leitor.nextInt();

        if (a > b && a > c) {
            System.out.printf("\nNumero %d é maior\n", a);

        } else if (a < b && b > c) {
            System.out.printf("\nNumero %d é maior\n" , b);
        } else {
            System.out.printf("\nNumero %d é maior\n ", c);
        }

    }

}
