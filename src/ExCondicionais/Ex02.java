package ExCondicionais;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num1, num2, div;
        
        System.out.println("primeiro numero:  ");
        num1 = leitor.nextDouble();

        System.out.println("segundo numero:  ");
        num2 = leitor.nextDouble();

        if (num2 == 0) {
            System.out.println("não é exata:  ");
            
        } else if ((num1 / num2 < 0)) {
            System.out.println("não é exata: ");

        } else {
            System.out.println("r: " + num1 / num2);
        }
    }
}
