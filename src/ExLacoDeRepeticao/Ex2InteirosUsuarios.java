package ExLacoDeRepeticao;

import java.util.Scanner;

public class Ex2InteirosUsuarios {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n, i = 1, soma = 0;

        System.out.println("Valor:  ");
        n = leitor.nextInt();

        while (i <= n) {
            soma = soma + i;
            i++;
            
        }
            System.out.println("a soma é : " + soma);
    }
}
