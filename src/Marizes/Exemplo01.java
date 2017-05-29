/*

 */
package Marizes;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] m = new int[2][4];

        for (int i = 0; i < 2; i++) {
            System.out.println("inf. elemnetos: " + (i + 1) + ";");

            for (int j = 0; j < 4; j++) {
                System.out.println("coluna:  " + (j + 1) + ": ");
                m[i][j] = leitor.nextInt();

            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("linha:  " + (i + 1) + ":  ");
            for (int j = 0; j < 4; j++) {
                System.out.println("colunas:  " + (j + 1) + " : " + m[i][j]);
            }
        }
    }
}
