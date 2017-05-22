/*
Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3.
 */
package Lista4Funcao;

import java.util.Scanner;

public class Ex4DivSom {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int n = entrada();
        int som = 0;
        int aux = 0;
        int resultado = 0;
        int fat = 0;
        int s = somatorio(n, som);
        int f = fatorial(n, s, som);
        double d = div(fat,som,resultado);


         System.out.println(d+": divisão");
    }

    public static int entrada() {
        int n;
        System.out.println("Numero inteiro:  ");
        n = leitor.nextInt();
        return n;
    }

    public static int somatorio(int n, int som) {
        som = 0;
        int i = 1;
        while (i <= n) {
            som = som + i;
            i++;

        }

        return som;
    }

    public static int fatorial(int n, int fat, int som) {
        fat = 0;
        int i = 1;
        while (i <= n) {
            fat = fat * i;
            i++;
        }

        return fat;
    }

    public static double div(int fat, int som, int resultado) {
        resultado = 0;

        resultado = fat / som;

        return resultado;
    }
}
