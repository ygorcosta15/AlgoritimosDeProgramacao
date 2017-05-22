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
     
        
        int n = positivo();
        int som = 0;
        int aux = 0;
        int res = somatorio(n,som,aux);

        System.out.println("Somatorio: "+res+" Divido: "+aux);
    }

    public static int positivo() {
        int n;
        System.out.println("Numero inteiro:  ");
        n = leitor.nextInt();
        return n;
    }

    public static int somatorio(int n, int som,int aux ) {
        som = 0;
        int i = 1;
        while (i <= n) {
            som = som + i;
            i++;

        }
        
         aux = som / n;
        return som;
    }
}
