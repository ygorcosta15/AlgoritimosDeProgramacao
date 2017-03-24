package A.P.I;

import java.util.Scanner;

public class PositivoDobro {

    public static void main(String[] args) {
        int numPosi, dobro;

        Scanner leitor = new Scanner(System.in);

        System.out.println("valor inteiro positivo: ");
        numPosi = leitor.nextInt();

        dobro = numPosi * 2;

        System.out.println("o dobro é: " + dobro);

    }

}
