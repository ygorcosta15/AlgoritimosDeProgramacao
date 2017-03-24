package A.P.I;

import java.util.Scanner;

public class MediaDe3Valores {

    public static void main(String[] args) {

        //variaveis
        float p1, p2, p3, p4, soma;

        // para leitura de valores com entradas por teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("primeira nota:");
        p1 = leitor.nextFloat();

        System.out.println("Segunda nota: ");
        p2 = leitor.nextFloat();

        System.out.println("Terceira nota: ");
        p3 = leitor.nextFloat();

        System.out.println("Quarta nota: ");
        p4 = leitor.nextFloat();
        
        //processamento de dados
        soma = (p1 + p2 + p3 + 4) / 4;
        
        //saida para o usuario
        System.out.println("sua nota é : " + soma);

    }

}
