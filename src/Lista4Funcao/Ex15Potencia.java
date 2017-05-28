/*
Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X Z ( sem utilizar
funções ou operadores de potência prontos ).
 */
package Lista4Funcao;

import java.util.Scanner;

public class Ex15Potencia {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
int x = dados();
int z = dados();
int r = calculo(x,z);
       
                
       
        System.out.println("resultado:  "+r);;
    }

    static int dados() {
     int x;
        
     System.out.println("X");
     x=leitor.nextInt();
     return x;

    }

    static int calculo(int x,int z) {
        int cal;
        cal = x * z;

        return cal;
    }
}
