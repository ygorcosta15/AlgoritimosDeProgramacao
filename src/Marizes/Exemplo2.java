/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marizes;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = 6;
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    m[i][j] = 0;
                } else if ((i + j) == (n - 1)) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 2;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
