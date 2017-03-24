package A.P.I.Exercios;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double a,b,c,area, aux;
        // A= Base C=Altura
        
       System.out.println("base do retangulo: ");
       a = leitor.nextDouble();
       
       System.out.println("Altura");
       c = leitor.nextDouble();
       
       area = ((a*c)/2);        
       System.out.println("area do retangulo é: " + area);
        // inicia  a questão B
        c = 3.14;
        System.out.println("entre com um valor:  ");
        aux = leitor.nextDouble();
        
        area = aux * aux * c;
        
        
        // inicia a questao C;
        
        System.out.println("a area é:  " + area);
        
        System.out.println(" primeira base:  " );
        a = leitor.nextDouble();
        
        System.out.println(" segunda base:  " );
        b = leitor.nextDouble();
        
        System.out.println("altura:  " );
        c = leitor.nextDouble();
        
        area = ((c+(a+b))/2);
        
        System.out.println("a rea do trapeszio é:  " + area);
        
        // inicia questão B;
        
        System.out.println("lado do quadrado:  ");
        b = leitor.nextDouble();
        
        area = b*b;
        System.out.println("A area do quadrado é: " +  area);
        
    }
}
