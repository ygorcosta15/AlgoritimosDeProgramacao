package ExLacoDeRepeticao;
/*
Faça um programa que mostre todos
os números inteiros de 1 a 50.
Use o laço WHILE
*/
import java.util.Scanner;

public class Ex1NumerosInteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = 0;

        while (x <=50) {
            System.out.println("numeros inteiros:  " + x);
            x = x + 2;
        }

    }
}
