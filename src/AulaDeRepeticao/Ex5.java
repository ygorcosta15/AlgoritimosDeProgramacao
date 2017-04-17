package AulaDeRepeticao;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 1, n, calculo;

        System.out.println("valor de n:");
        n = leitor.nextInt();

        do {
            calculo = i * n;
            System.out.println(i + " * " + n + " = " + calculo);
            i++;
        } while (i <= 10);

    }
}
