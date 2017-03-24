package A.P.I.Exercios;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a1, a2;

        System.out.println("primeiro numero:  ");
        a1 = leitor.nextInt();

        System.out.println("segundo valor:  ");
        a2 = leitor.nextInt();

        a1 = a1 + 1;
        a2 = a2 - 1;

        System.out.println("primeiro numero consecutivo: " + a1);
        System.out.println("Segundo numero consecutivo:" + a2);
    }
}
