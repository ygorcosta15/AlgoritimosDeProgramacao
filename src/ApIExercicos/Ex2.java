package ApIExercicos;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a1, a2, b;

        System.out.println("entre com o primeiro valor:  ");
        a1 = leitor.nextDouble();

        System.out.println("entre com o segundo valor:  ");
        a2 = leitor.nextDouble();

        b = Math.pow(a1, a2);

        System.out.println("a potencia dos dois umeros são: " + b);

    }
}
