package ApIExercicos;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        int a;
        System.out.println("entre com algum valor:");
        a = leitor.nextInt();
        
        if(a %2 ==0){
            System.out.println("numero par:  " + a);
        }else{
            System.out.println("numero  impar:  " + a);
        }
        
    }
}
