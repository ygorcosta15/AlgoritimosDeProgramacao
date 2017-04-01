package ApIExercicos;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double v1,v2,aux;
        
        System.out.println("informe o primeiro valor:  ");
        v1 = leitor.nextDouble();
        
        System.out.println("informe o segundo valor:  ");
        v2 = leitor.nextDouble();
        
        aux = Math.sqrt (v1 + v2);
        
        System.out.println("resultado: " + aux);
        
        
    }
}
