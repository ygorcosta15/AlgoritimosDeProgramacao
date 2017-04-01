package ApIExercicos;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] agrs) {
        Scanner leitor = new Scanner(System.in);

        double numHT, vH, aux;
        int numF;

        System.out.println("numero do funcionario:  ");
        numF = leitor.nextInt();

        System.out.println("numero de horas trabalhadas:  ");
        numHT = leitor.nextDouble();

        System.out.println("qunato voce recebe por hora:  ");
        vH = leitor.nextDouble();

        aux = numHT * vH;

        System.out.println("o numero do funcionario:  " + numF);
        System.out.println("total a receber:  " + aux);

    }
}
