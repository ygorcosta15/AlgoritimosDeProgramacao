package ApIExercicos;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, b, c, aux1, aux2;

        System.out.println("primeiro valor;  ");
        a = leitor.nextDouble();

        System.out.println("segundo  valor;  ");
        b = leitor.nextDouble();

        System.out.println("terceiro valor;  ");
        c = leitor.nextDouble();

        aux1 = a * b;
        aux2 = c / aux1;

        if (aux2 == 0) {
            System.out.println("impossivel calcular: " + aux2);

        } else {
            System.out.println(aux2);
        }

    }
}
