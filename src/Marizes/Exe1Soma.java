/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marizes;

import java.util.Scanner;

public class Exe1Soma {

    static Scanner leitor = new Scanner(System.in);

    static int tamanhoMatriz() {
        int tamanho;

        System.out.println("Qual o tamanho da primeira  matriz?  ");
        tamanho = leitor.nextInt();

        return tamanho;
    }

    static int[][] criandoMatriz(int linhas, int colunas) {
        int[][] mat = new int[linhas][colunas];

        return mat;

    }

    static int[][] populando(int[][] matriz) {// primaira matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz [%d] [%d] : ", i, j);
                matriz[i][j] = leitor.nextInt();

            }
        }
        return matriz;
    }

    // SEGUNDA MATRIZ
    static int tamanhoMatriz2() {
        int tamanho;

        System.out.println("Qual o tamanho da segunda   matriz?  ");
        tamanho = leitor.nextInt();

        return tamanho;
    }

    static int[][] popula2Mat(int[][] matriz2) {
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.printf("matriz [%d] [%d] : ", i, j);
                matriz2[i][j] = leitor.nextInt();

            }
        }
        return matriz2;
    }

    static int[][] criandoMatriz2(int linhas, int colunas) {
        int[][] mat = new int[linhas][colunas];

        return mat;

    }

    public static void main(String[] args) {
        int linhas = tamanhoMatriz();
        int colunas = tamanhoMatriz();
        int[][] matriz = criandoMatriz(linhas, colunas);
        matriz = populando(matriz);

        // SEGUNDA MATRIZ
        int lihas2 = tamanhoMatriz2();
        int colunas2 = tamanhoMatriz2();
        int[][] mat = criandoMatriz2(linhas, colunas);
        mat = popula2Mat(matriz);

        int[][] soma = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                
                soma[i][j] = matriz[i][j] + mat[i][j];
                System.out.printf("%d\t", soma[i][j]);

            }

        }
    }
}
