package ApIExercicos;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomefunc;
        double SalFixo, VendEfetuadas, result;

        System.out.println("nome do vendendor:");
        nomefunc = leitor.next();
        System.out.println("salario fixo:  ");
        SalFixo = leitor.nextDouble();
        System.out.println("vendas efeutadas (em dinheiro):  ");
        VendEfetuadas = leitor.nextDouble();
        

        
        result =  SalFixo +(VendEfetuadas * 15/ 100);

        System.out.println("total a receber:  " + result);

    }
}
