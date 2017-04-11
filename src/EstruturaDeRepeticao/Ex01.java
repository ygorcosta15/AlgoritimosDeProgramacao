package EstruturaDeRepeticao;
/*
Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
while.*/
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
       int y = 0;
       
       while ( y <=100){
           System.out.println(y);
           y = y +2;
       }
        
    }
}
