package A.P.I;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        int nota1, nota2, peso1, peso2, media;

        peso1 = 6;
        peso2 = 4;

        Scanner leitor = new Scanner(System.in);

        System.out.println("qual foi a priemira nota ? ");
        nota1 = leitor.nextInt();

        System.out.println("qual foi a sua segunda nota ? ");
        nota2 = leitor.nextInt();

        media = (((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2));

        System.out.println("sua media é :  " + media);
    }

}
