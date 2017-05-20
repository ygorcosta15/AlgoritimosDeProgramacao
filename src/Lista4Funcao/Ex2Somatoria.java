/*
 Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.
 */
package Lista4Funcao;

import java.util.Scanner;

public class Ex2Somatoria {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int n = entrada();
        int som = 0;
        int soma = somatoria(n, som);

        System.out.println("soma : " + soma);
    }

    static int entrada() {

        System.out.println("Algum numero inteir: ");
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
}
