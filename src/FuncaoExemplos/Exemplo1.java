package FuncaoExemplos;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        
        System.out.println("***CALCULADORA COM FUNÇOES***\n");

        double usuario = dados();
       // int operacao = ope();
        
    }
    public static double dados(){
        Scanner leitor = new Scanner(System.in);
        
        double aux =0;
        double n1;
        double n2;

        System.out.println("n1: ");
        n1 = leitor.nextInt();

        System.out.println("n2: ");
        n2 = leitor.nextInt();
        
        return aux;
    }

    public static int ope(double usuario) {
        Scanner leitor = new Scanner(System.in);

        int op = 0;
            
        
        System.out.println("*** OPERAÇÃO DESEJADA***\n"
                + " 1) soma\n"
                + " 2) multiplicação\n"
                + " 3)subtração\n "
                + " 4) divisão");
        op = leitor.nextInt();

        switch (op) {
            case 1:
                System.out.println("a soma é : " + usuario );
        }

        return op;
    }

    public static int soma() {
        Scanner leitor = new Scanner(System.in);

        int n12 = 0;
      

        n12 = n1 + n2;

        return n12;
    }
}
