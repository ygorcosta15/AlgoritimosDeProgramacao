/*
Algoritimo : Relogio.
 */
package AulaDeRepeticao;

import java.util.Scanner;

public class lacoAlinhado {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

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
    }
}
