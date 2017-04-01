package ApIExercicos;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float v1, v2, v3, v4,result;

        System.out.println("valor 1");
        v1 = leitor.nextFloat();

        System.out.println("valor 2");
        v2 = leitor.nextFloat();

        System.out.println("valor 3");
        v3 = leitor.nextFloat();

        System.out.println("valor 4");
        v4 = leitor.nextFloat();

        result = ((v1 + v2 + v3 + v4)/4);
        
        
        System.out.println("a media é:   " + result);
        
    }

}
