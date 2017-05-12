/*
            1. add o controle de dias
1) domingo
2) segunda
            2. Permitir a entrada
            de imformações pelo usuario

1) dia , hora,minutos e segundos
2) imprimir as infrmaçãoes 
ate a condição de parada.
 */
package AulaDeRepeticao;

import java.util.Scanner;

public class Ex1AddControle {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int d, hu, mu, su, c = 1;

        System.out.println("dia da semana: ");
        d = leitor.nextInt();

        switch (d) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;

        }

        System.out.println("\ninformar hora:");
        hu = leitor.nextInt();

        System.out.println("\ninformar minutos:");
        mu = leitor.nextInt();

        System.out.println("\ninformar segundos:");
        su = leitor.nextInt();

        while (true) {
            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {
                    for (int s = 0; s <= 59; s++) {
                        System.out.printf("\n%dh:%dm:%ds ", h, m, s);

                        if (h == hu && m == mu && s == su) {
                            System.out.println("\n ALARME !!! ");
                            break;
                        }

                    }

                    if (m == mu) {
                        break;
                    }
                }
                if (h == hu) {
                    break;
                }

            }

            System.out.println("(1) continua."
                    + "\n (0)Parar execução. ");
            c = leitor.nextInt();
            if (c == 0) {
                break;
            }

        }
    }
}
