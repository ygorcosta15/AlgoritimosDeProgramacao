package ApIExercicos;
import java.util.Scanner;
public class Ex13 {
    public static void main(String [] args){
        Scanner leitor = new Scanner (System.in);
        
        int v1, v2;
        
        System.out.println("entre com o primeiro valor:   ");
        v1 = leitor.nextInt();
        
        System.out.println("entre com o segundo valor:   ");
        v2 = leitor.nextInt();
        
        if(v1>v2){
            System.out.println("o primeiro valor é maior:  "+ v1);
            
        }else{
            System.out.println("o segundo valor é maior:  " + v2);
        }
        
    }
    
}
