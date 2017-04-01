package ApIExercicos;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double Hinicio, fim, aux;

        System.out.println("horario de inicio:  ");
        Hinicio = leitor.nextDouble();

        System.out.println("horario do temino:");
        fim = leitor.nextDouble();

        aux = Hinicio - fim;

        if (Hinicio <= 24 || fim <= 24) {
            System.out.println("rempo da partida:  " + aux);

        } else if (Hinicio > 24 || fim > 24) {

            System.out.println("horario invalido:  ");
        }
    }
}
