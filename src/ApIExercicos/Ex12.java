package ApIExercicos;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double L, R;

        System.out.println("Valor de L:");
        L = leitor.nextDouble();
        L = L * L;
        System.out.println(L);

        System.out.println("Valor de R:");
        R = leitor.nextDouble();

        System.out.println(R);
        R = (3.14 * R);
        System.out.println(R);
        
        
        if (L >  R) {
            System.out.println("valor de L é maior:  " + L);
        } else {
            System.out.println("valor de R é maior:  " + R);
        }
    }
}
