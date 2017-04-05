package ExSwitchCase;

/*7. Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela:
1) crianças com menos de 10 anos pagam R$80;
2) conveniados com idade entre 10 e 30 anos pagam R$50;
3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
4) conveniados com mais de 60 anos pagam R$130.*/
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x;

        System.out.println("idade:  ");
        x = leitor.nextInt();

        if (x < 10) {
            System.out.println("valor a ser pago 180,00  ");
        } else if (x >= 10 && x <= 30) {
            System.out.println("valor a ser pago 150,00");

        } else if (x >= 40 && x <= 60) {
            System.out.println("valor a ser pago 195,00  ");
        } else if (x > 61) {
            System.out.println(" valor a ser pago 230,00");

        }
    }
}
