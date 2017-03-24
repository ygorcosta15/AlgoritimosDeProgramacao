package A.P.I.Exercios;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float lado, area;
        
        System.out.println("primeiro valor");
        lado = leitor.nextFloat();
        
       area = lado * lado;
               
              System.out.println("sua area é:  " + area);
        
    }

}
