/*
Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR.
*/

package ExLacoDeRepeticao;
import java.util.Scanner;
public class Ex4Serie {
    public static void main(String[] args) {
        Scanner leitor = new Scanner( System.in);
        
        
        
        
        for (int  x =0; x <=1000; x = x + 10 ){
       
            System.out.println("saida:  " + x  );
        }
        
    }
    
}
