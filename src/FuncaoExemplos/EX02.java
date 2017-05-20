/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncaoExemplos;

import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {

        int n1 = dados();
        int n2 = dados();
        int r = maior(n1, n2);

        System.out.println(r);

    }

    static int dados() {
        Scanner leitor = new Scanner(System.in);

        int n1;
        System.out.println(" numero:  ");
        n1 = leitor.nextInt();

        return n1;

    }

    static int maior(int n1, int n2) {
        int resul = 0;

        if (n1 > n2) {
            resul = n1;
        } else if (n1 < n2) {
            resul = n2;
        }

        return resul;
    }

}
