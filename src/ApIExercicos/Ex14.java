package ApIExercicos;
import java.util.Scanner;
public class Ex14 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        
        double v1,v2,aux;
        
        System.out.println("Valor 1:  ");
        v1 = leitor.nextDouble();
        
        System.out.println("Valor 2:");
        v2 = leitor.nextDouble();
        
        if(v1 > v2 ){
            aux = v1/v2;
            System.out.println("o primeiro valor dividido pelo segundo:  " + aux);
        }else if (v1 < v2 ){
            aux = v2/v1;
            System.out.println("o segundo valor é dividido pelo primeiro:  " + aux);
        }
            
        
        
    }
    
}
