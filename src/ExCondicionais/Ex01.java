package ExCondicionais;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1, n2 = 100;

        System.out.print("n1: ");
        n1 = leitor.nextInt();

        if (n1 > n2  )  {
            System.out.printf("o numero %d é maior que 100.\n ", n1 + 150);
        } else  {
            System.out.println("o numero é meonor que 100");
            } 

    }
}
