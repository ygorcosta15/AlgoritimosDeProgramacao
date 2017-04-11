package ExSwitchCase;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x;
        int y;

       /* System.out.println("ENTRE COM ALGUM ANO:");
        y = leitor.nextInt();*/
        System.out.println("ENTRE COM O ALGUM NUMERO:  ");
        x = leitor.nextInt();
        
        /*y = y / 400 % 2 ;
        
        if (y == 1 ){
            System.out.println("ano bicesto");
        }else{
            System.out.println("nao é bicesto");
        }*/

        switch (x) {
            case 1:
                System.out.println("JANEIRO,   31 DIAS.");
                break;
            case 2:
           
                System.out.println("FEVEREIRO 28 DIAS. ");
                break;
            case 3:
                System.out.println("MARÇO  31 DIAS.  ");
                break;
            case 4:
                System.out.println(" ABRIL 30 DIAS.  ");
                break;
            case 5:
                System.out.println("MAIO 30 DIAS. ");
                break;
            case 6:
                System.out.println("JUNHO 31 DIAS.  ");
                break;
            case 7:
                System.out.println("JULHO 30 DIAS.  ");
                break;
            case 8:
                System.out.println("AGOSTO  31 DIAS.  ");
                break;
            case 9:
                System.out.println("SETEMBRO 30 DIAS.  ");
                break;
            case 10:
                System.out.println("NOVEMBRO  30 DIAS  ");
                break;
            case 12:
                System.out.println("DEZEMBRO 31 DIAS. ");
                break;
            default:
                System.out.println("NUMERO INVALIDO, TENTE NOVAMENTE;");
        }
    }
}
