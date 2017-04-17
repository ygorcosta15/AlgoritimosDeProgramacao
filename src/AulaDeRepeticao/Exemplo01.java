package AulaDeRepeticao;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int y = 0, soma = 0, aux = 10;
        /* EXEMPLO FOR*/

 /*for (y = 0; y <= 10; y++) {
            System.out.println("digite o item:  " + y);
            y = leitor.nextInt();
            soma = soma + y;
        }

        System.out.println("total :  " + soma);*/
 /* EXEMPLO WHILE*/

 /*  while ( y <=31) {
            System.out.println("EXEMPLO WHILE :)" + y);
            y = y + 5;
       
        }
        
 /* EXEMPLO DO WHILE*/
        do {
            System.out.println(y + " É MENOR QUE " + aux);
            y++;
            
            
        } while (y < aux);
        

    }

}
