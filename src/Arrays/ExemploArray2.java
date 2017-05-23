package Arrays;

/*
1 tamanho
2 est.vetor
3 poúlar vetor
4 imptimr vetor
 */
import java.util.Scanner;

public class ExemploArray2 {

    static Scanner leitor = new Scanner(System.in);

    static int tamanhoVetor() {
        int t;
        System.out.println(" TAMANHO VETOR \n");

        System.out.println("tamanho: ");
        t = leitor.nextInt();

        return t;
    }

    static int[] criaVetor(int t) {

        int[] vetor = new int[t];

        return vetor;
    }

    static int[] populaVetor(int[] vetor) {

        System.out.println("Popula vetor:\n ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento:");
            vetor[i] = leitor.nextInt();
        }
        return vetor;

    }

    static void imprimiVetor(int vetor[]) {

        System.out.println("\nImprimi Vetor\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]:" + vetor[i]);
        }

    }

    public static void main(String[] args) {

        int t = tamanhoVetor();
        int[] c = criaVetor(t);
        c = populaVetor(c);
        imprimiVetor(c);

    }
}
