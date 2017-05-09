package FuncaoExemplos;


import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("***SOMA DE DOIA VALORES***\n");
        
        
        
        int a;
        int b;
        
        
        
       System.out.println("a soma :  " + soma );
    }

    static int soma(int a, int b) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

        System.out.println("valor 1: ");
        a = leitor.nextInt();

        System.out.println("valor 2:");
        b = leitor.nextInt();

        soma = a + b;
        return soma;

    }
}
