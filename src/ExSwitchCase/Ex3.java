package ExSwitchCase;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int notas;
        int quantidade;
        System.out.println("SAQUE: ");
        notas = leitor.nextInt();

        if (notas % 100 == 0) {
            quantidade = notas / 100;
            System.out.println(" NOTAS DE R$ 100,00: " + quantidade);
        } 
        else if (notas % 50 == 0) {
            quantidade = notas / 50;
            System.out.println("NOTAS DE R$ 50,00:  " + quantidade);
            
        }
        else if (notas % 20 == 0) {
            quantidade = notas / 20;
            System.out.println("NOTAS DE R$ 20,00: " + quantidade);
        }
        else if (notas % 10 == 0) {
            quantidade = notas / 10;
            System.out.println("NOTAS DE R$ 10,00:  " + quantidade);
        }
        else if (notas % 5 == 0) {
            quantidade = notas / 5;
            System.out.println("NOTAS DE R$ 5,00:  " + quantidade);
        }
        else if (notas % 1 == 0) {
            quantidade = notas / 1;
            System.out.println("NOTAS DE R$ 1,00:  " + quantidade);
        }
    }
}
