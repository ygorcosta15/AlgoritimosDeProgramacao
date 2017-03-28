package ApIExercicos;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("entre com o primeiro numero");
        a = leitor.nextInt();

        System.out.println("Entre com segundo valor");
        b = leitor.nextInt();

        c = a * 2;
        d = b * 2;

        System.out.println("O dobro do primiro valor é: " + c);
        System.out.println("o dobro do segundo valor é : " + d);
    }

}
