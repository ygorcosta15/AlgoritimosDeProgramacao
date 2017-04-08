package ExSwitchCase;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int v1, v2, resultado;
        String op;
        
        System.out.println("ESCOLHA UM OPERADOR MATEMATICO:  ");
        System.out.println("1)*");
        System.out.println("2)-");
        System.out.println("3)+");
        System.out.println("4)/");
        op = leitor.next();

        System.out.println("VALOR 1: ");
        v1 = leitor.nextInt();
        System.out.println("VALOR 2:  ");
        v2 = leitor.nextInt();

        
        switch (op) {
       
            case "*":
                System.out.println("resultado:  " + v1 * v2);
                break;
            case "-":
                System.out.println("RESULTADO :  " +( v1 - v2));
                break;
            case "+":
                System.out.println("RESULTADO:  " + v1 + v2);
                break;
            case "/":
                System.out.println("RESULTADO:  " + v1 / v2);
                break;

        }

    }

}
