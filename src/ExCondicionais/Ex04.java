package ExCondicionais;
import java.util.Scanner;
public class Ex04 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
            double energia,kwh;
        
            System.out.println("valor consumido:  ");
            kwh = leitor.nextDouble();
            
            
            
            
            if( kwh <  150){
        System.out.println("valor R$ 0,20");
    }else if (kwh > 150 && kwh < 500 );
            System.out.println(" valor R$ 0,25");{
        
    } if ( kwh > 500){
        System.out.println("valor R$ 0,30");{
    }
}
