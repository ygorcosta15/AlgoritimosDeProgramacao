/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncaoExemplos;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int n1 = dados();
        int r = pi(n1);
        
        //System.out.println(r);
        
    }
   
    
     static int dados() {
        Scanner leitor = new Scanner(System.in);

        int n1;
        System.out.println(" numero:  ");
        n1 = leitor.nextInt();

        return n1;

    }


     static int pi( int n1){
         int result = 0;
         
         if(n1 % 2 ==0 ){
             System.out.println("par: " + n1);
         }else{
             System.out.println("imapar: " + n1);
             
         }
         
         return result;
     }

}

