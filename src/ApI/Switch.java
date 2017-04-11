package ApI;

import java.util.Scanner;
public class Switch {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
            
        char grade = 'B';

        switch (grade) {

            case 'A':
                System.out.print("Excelente!");
                break;
            case 'B':
            case 'C':
                System.out.print("Bem feito!");
                break;
            case 'D':
                System.out.print("Você passou!");
            case 'E':
                System.out.print("Melhor tentar novamente!");
                break;
            default:
                System.out.print("Conceito inválido!");
        }
    }
}
