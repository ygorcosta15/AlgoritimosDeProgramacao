/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

public class ExemploArray {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 10;
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Número:  ");
            v[i] = leitor.nextInt();
        }
        int soma = 0;
        int menor = v[0];
        int maior = v[0];

        for (int i = 0; i < n; i++) {
            soma = soma + v[i];

            if (v[i] < menor) {
                menor = v[i];

                if (v[i] > maior) {
                    maior = v[i];
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println("v[" + i + "]:" + v[i]);

            if (v[i] == menor);
            System.out.print("  <--- Menor");

            if (v[i] == maior);
            System.out.print("  <---Maior");
            System.out.print("");
        }
        System.out.println("soma:  " + soma);
    }
}
