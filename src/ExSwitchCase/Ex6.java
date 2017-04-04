package ExSwitchCase;

import java.util.Scanner;

public class Ex6 {

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
                System.out.println("SEGUNGA FEIRA, DIA DE SEMANA ");
            break;
            case 3 :
                System.out.println("TERÇA FEIRA,DIA DE SEMANA");
            break;
            case 4:
                System.out.println("QUARTA FEIRA,DIA DE SEMANA");
            break;
            case 5:
                System.out.println("QUINTA FEIRA,DDIA DE SEMANA");
            break;
            case 6:
                System.out.println("SEXTA FEIRA,DIA DE SEMANA");
             break;
            case 7:
                System.out.println("SABADO,DIA DE SEMANA");
             break;
             
            default:
                System.out.println("NUMERO INVALIDO TENTE NOVAMENTE:");
        }
    }
}
