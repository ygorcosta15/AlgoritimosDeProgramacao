/*
Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.
Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5
*/
package Lista4Funcao;

import java.util.Scanner;

public class Ex3Fatorial {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        int n = entrada();
        int mult =1;

        int result = fatorial(n, mult);

        System.out.println("Fatorial é : " + result);
    }

    static int entrada() {

        System.out.println("Algum numero inteiro: ");
        int n = leitor.nextInt();
        return n;
    }

    static int fatorial(int n, int mult) {
        mult = 1;
        int i = 1;

        while (i <= n) {
            mult = mult * i;
            i++;

        }

        return mult;
    }
}
