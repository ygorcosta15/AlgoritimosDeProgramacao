package ExCondicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("n1:  ");
        n1 = leitor.nextInt();

        System.out.print("n2:  ");
        n2 = leitor.nextInt();

        System.out.println("n3:  ");
        n3 = leitor.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("O numero %d é o maior ", n1);
            
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("O nomero %d é o maior ", n2);

        } else {
            System.out.printf("o numero %d é o maior \n ", n3);
        }

    }
}
