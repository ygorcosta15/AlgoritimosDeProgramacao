/*
Algoritimo : Relogio.
 */
package AulaDeRepeticao;

import java.util.Scanner;

public class LacoAlinhado01{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

             
        int c = 1;
        
        
        while (true){ // para perguntar ao usuario se ira continuar a extecução
            
        
        for (int h = 0; h <= 23; h++) {// horas.

            for (int m = 0; m <= 59; m++) { // minutos

                for (int s = 0; s <= 59; s++) { // segundos.
                    System.out.printf(" %dh:%dm:%ds\n", h, m, s);

                    if (h == 23 && m == 50 && s == 50) {// para paralisar o relogio.
                        System.out.println("  ALARME !!! ");
                        break;

                    }
                }
                if (m == 50) {
                    break;
                }
            }
            if (h == 23) {
                break;
            }
        }
        System.out.println(" 1) Continua"
                + " \n 0) Para a execução.");
        c = leitor.nextInt();
        if ( c == 0 ){
            break;
        }
    }
}
}
