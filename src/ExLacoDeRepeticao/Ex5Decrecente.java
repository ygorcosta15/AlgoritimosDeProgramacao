/*
Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, ou seja, o laço
deve iniciar em 100 e encerrar em 1. Use o laço FOR .
 */
package ExLacoDeRepeticao;
import java.util.Scanner;        
public class Ex5Decrecente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner ( System.in);
        
          int x = 0;
        
        for ( x = 100 ;x >= 1; x = x -2 ){
       
            System.out.println("saida:  " + x  );
        }
        
        
    }
    
}
