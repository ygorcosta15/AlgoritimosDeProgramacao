package ApIExercicos;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double a1, a2, soma2;

        System.out.println("Primeiro numero");
        a1 = leitor.nextDouble();

        System.out.println("segundo numero");
        a2 = leitor.nextDouble();

        a1 = a1 * a1;
        a2 = a2 * a2;

        soma2 = a1 + a2;

        System.out.println("A soma dos Quadrados:  " + soma2);
    }

}
