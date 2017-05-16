package FuncaoExemplos;

import java.util.Scanner;

public class CalculadoraComFuncao {

    static Scanner input = new Scanner(System.in);

    static int menu() {

        int opcao;

        System.out.println("1-adição");
        System.out.println("2-subtração");
        System.out.println("3-multiplicação");
        System.out.println("4- divisão");

        opcao = input.nextInt();

        return opcao;

    }

    static double op(int opcao, int n1, int n2) {
       
        double r = 0 ;

        switch (opcao) {
            case 1:
                r = add(n1, n2);
                break;
            case 2:
                r = sub(n1, n2);
                break;
            case 3:
                r = mult(n1, n2);
                break;
            case 4:
                r = div(n1, n2);
                break;

        }
        return r;
    }

    static int entradaDados() {

        int n;
        System.out.println("Número 1:  ");
        n = input.nextInt();

        return n;
    }

    static int add(int n1, int n2) {
       
        int res = n1 + n2;

        return res;
    }

    static int sub(int n1, int n2) {
       
        int res = n1 - n2;

        return res;
    }

    static int mult(int n1, int n2) {

        
        int res = n1 * n2;

        return res;
    }

    static double div(int n1, int n2) {

       
        double res = n1 / n2;

        return res;
    }

    static void imprimir(double n) {
        System.out.println("Resuldo:  " + n);

    }

    public static void main(String[] args) {

        int opcao = menu();
        int n1 = entradaDados();
        int n2 = entradaDados();
        double r = op(opcao, n1, n2);
        imprimir(r);

    }
}
