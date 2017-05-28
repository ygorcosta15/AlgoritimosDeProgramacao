package Arrays;

import java.util.Scanner;

public class AlterandoArray {

    static Scanner leitor = new Scanner(System.in);

    static int tamanhoVetor() {
        int n;

        System.out.println("Tamanho: ");
        n = leitor.nextInt();

        return n;
    }

    static int[] criaVet(int n) {

        int[] vetor = new int[n];

        return vetor;
    }

    static int[] populaVetor(int[] vetor, int menor, int maior) {
        int[] v = null;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("numeros: ");
            vetor[i] = leitor.nextInt();

            if (vetor[i] < menor) {
                menor = v[i];
                if (vetor[i] > maior) {
                    maior = v[i];
                }
            }
        }
        return vetor;
    }

    static int[] maiorMenor(int[] vetor, int menor, int maior, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("v[" + i + "]:" + vetor[i]);

            if (vetor[i] == menor);
            System.out.print(" <--menor");
            if (vetor[i] == maior);
            System.out.print("  <--Maior");
        }
        return vetor;
    }

    public static void main(String[] args, int n) {
        int t = tamanhoVetor();
        int[] c = criaVet(n);
//        int[] c = populaVetor(vetor);
  //      int[] mM = maiorMenor(vetor, menor, maior, n);
    }

}
