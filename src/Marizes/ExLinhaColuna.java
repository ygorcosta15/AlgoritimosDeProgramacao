/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marizes;

import java.util.Scanner;

public class ExLinhaColuna {

    static Scanner leitor = new Scanner(System.in);

    static int tamanhoMatriz() {
        int t;
        System.out.println("tamanho matriz:  ");
        t = leitor.nextInt();

        return t;
    }

    static int[][] criaMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];

        return matriz;

    }

    static int[][] populaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz [%d] [%d] : ", i, j);
                matriz[i][j] = leitor.nextInt();

            }
        }
        return matriz;

    }

    static void imprimiMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz [%d] [%d]  %d : ", i, j, matriz[i][j]);

            }
        }

    }

    public static void main(String[] args) {
        int linhas = tamanhoMatriz();
        int colunas = tamanhoMatriz();
        int[][] matriz = criaMatriz(linhas, colunas);
        matriz = populaMatriz(matriz);
        imprimiMatriz(matriz);

    }

}
