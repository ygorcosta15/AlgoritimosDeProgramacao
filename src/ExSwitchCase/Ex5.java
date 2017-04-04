package ExSwitchCase;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x;

        System.out.println("INFORME NUMERO QUE REPRESENTE ALGUM MÊS:    ");
        x = leitor.nextInt();
        
      switch (x) {
            case 1:
                System.out.println("JANEIRO, MES DE ALTA TEMPORADA");
                break;
            case 2:
           
                System.out.println("FEVEREIRO, MES DE ALTA TEMPORADA");
                break;
            case 3:
                System.out.println("MARÇO,");
                break;
            case 4:
                System.out.println(" ABRIL,    ");
                break;
            case 5:
                System.out.println("MAIO, ");
                break;
            case 6:
                System.out.println("JUNHO, MES DE ALTA TEMPORADA  ");
                break;
            case 7:
                System.out.println("JULHO, MES DE ALTA TEMPORADA ");
                break;
            case 8:
                System.out.println("AGOSTO ,   ");
                break;
            case 9:
                System.out.println("SETEMBRO ");
                break;
            case 10:
                System.out.println("NOVEMBRO  ");
                break;
            case 12:
                System.out.println("DEZEMBRO, MES DE ALTA TEMPORADA ");
                break;
            default:
                System.out.println("NUMERO INVALIDO, TENTE NOVAMENTE;");
        }
    }
}
