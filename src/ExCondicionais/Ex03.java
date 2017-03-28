package ExCondicionais;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int peso, altura, aux;

        System.out.println("peso:  ");
        peso = leitor.nextInt();

        System.out.println("altura:  ");
        altura = leitor.nextInt();

        aux = (altura * altura /peso );
        
        
        if (aux < 26) {
            System.out.println("normal:  " + aux);

        } else if (aux > 26 && aux < 30  ) {
            System.out.println("obeso:  "  + aux);
        } else  {
            System.out.println("obeso mórbido:  " + aux );
        }
    }

}
