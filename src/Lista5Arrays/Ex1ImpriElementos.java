package Lista5Arrays;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.Scanner;

public class Ex1ImpriElementos {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        int t = tamanhoVetor();
        int[] c = criaVetor(t);
        c = populaVetor(c);
        imprimiVetor(c);
    }

    static int tamanhoVetor() {

        int t;
        System.out.println("TAMANHO DO VETOR:  ");
        
        t = leitor.nextInt();

        return t;

    }

    static int[] criaVetor(int t) {

        int[] vetor = new int[t];

        return vetor;

    }

    static int[] populaVetor(int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitor.nextInt();
        }
        return vetor;

    }

    static void imprimiVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]:" + vetor[i]);
        }
    }
}
