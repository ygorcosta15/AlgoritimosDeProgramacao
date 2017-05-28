/*
Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3.
 */
package Lista4Funcao;

import java.util.Scanner;

public class Ex4Div {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int n = entrada();
        int som = 1;
        int soma = somatoria(n, som);
        System.out.println("SOMATORIO :  " + soma);

        int n2 = entrada2();
        int cal = 1;
        int f = fatorial(n2, cal);
        System.out.println("FATORIAL :  " + f);

        System.out.println("DIVISÂO DO FATORIAL PELO SOMATORIO:  " + f / soma);

    }

    static int entrada() {

        System.out.println("Algum numero inteiro: ");
        int n = leitor.nextInt();
        return n;
    }

    static int somatoria(int n, int som) {

        som = 0;
        int i = 1;

        while (i <= n) {
            som = som + i;
            i++;
        }

        return som;
    }

    static int entrada2() {
        int n2;
        System.out.println("Numero: ");
        n2 = leitor.nextInt();
        return n2;
    }

    static int fatorial(int n2, int cal) {

        int i = 1;
        while (i <= n2) {
            cal = cal * i;
            i++;

        }

        return cal;
    }

}
