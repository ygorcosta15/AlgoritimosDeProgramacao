package ExSwitchCase;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x;

        System.out.println("INFORME ALGUM DIA DA SEMANA QUE REPRESENTE ALGUM DIA DA SEMANA:    ");
        x = leitor.nextInt();
        
        
        switch (x){
            
            case 1:
                System.out.println("DOMINGO,FIM DE SEMANA ");
            break;
            case 2:
                System.out.println("SEGUNGA FEIRA, DIA UTIL");
            break;
            case 3 :
                System.out.println("TERÇA FEIRA,DIA UTIL");
            break;
            case 4:
                System.out.println("QUARTA FEIRA,DIA UTIL");
            break;
            case 5:
                System.out.println("QUINTA FEIRA,DIA UTIL");
            break;
            case 6:
                System.out.println("SEXTA FEIRA,DIA UTIL");
             break;
            case 7:
                System.out.println("SABADO,FIM DE SEMANA");
             break;
             
            default:
                System.out.println("NUMERO INVALIDO TENTE NOVAMENTE:");
        }
    }
}
