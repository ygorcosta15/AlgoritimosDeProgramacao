package ExSwitchCase;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
            Scanner leitor = new Scanner (System.in);
        double x;
        
        System.out.println("ENTRE COM ALGUM VALOR:  ");
        x = leitor.nextInt();
        
     if(x % 3 == 0){
         System.out.println("divisivel por 3:  ");
         
     }else{
         System.out.println("nao divisivel por 3:   " );
     }
         
    }

}
