package A.P.I;

import java.util.Scanner;

public class Circunfercia {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double raio, aux, pi, resultado;
        raio = 3.14;

        System.out.println("entre com algum valor");
        aux = console.nextInt();

        pi = 3.14;
        resultado = pi * aux;

        System.out.println("a circunferencia é" + resultado);

    }
}
