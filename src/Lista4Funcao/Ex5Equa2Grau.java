/*Fazer uma função que tem como parâmetros de entrada três números reais a , b , c e fornece como saída a
maior raiz da equação do 2º grau:
ax2 + bx + c
Nesta questão, você deverá utilizar a fórmula de Báskara . Se não houver raízes reais, a função deve
retornar o número −1.*/
package Lista4Funcao;

import java.util.Scanner;

public class Ex5Equa2Grau {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

    public static double entradas(double a, double b, double c) {
        int ent = 0;
        System.out.println("valor de A:");
        a = leitor.nextDouble();

        while (a == 0) {
            System.out.println("Valor de A nao pode ser zero Equação de segundo grau");
            System.out.println("valor de A: ");
            a = leitor.nextDouble();
        }

        System.out.println("valor de B:");
        b = leitor.nextDouble();
        System.out.println("valor de C:");
        c = leitor.nextDouble();
        
        
        return ent;

    }

    public static double calculo(double x1, double x2, double a, double b, double c) {
        double delta;
        delta = ((b * b) - (4 * a * c));
        x1 = 0;
        x2 = 0;

        if (delta >= 0) {
            x1 = (-b + (Math.sqrt(delta)) / (2 * a));
            System.out.println("");
            x2 = (-b + (Math.sqrt(delta)) / (2 * a));
            System.out.println("x1 " + x1 + "x2 " + x2);

        } else {
            System.out.println("-1");
        }

        return delta;
    }

}
