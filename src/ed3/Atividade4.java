package ed3;

import java.util.Scanner;

/**
 * Created by jrg_c on 16/08/2016.
 */
public class Atividade4 {
    public static void main(String[] args) {
        int vetor[] = new int[5], vetor2[] = new int[5], i, aux=4;
        Scanner tc = new Scanner(System.in);
        for(i=0; i<5; i++){
            System.out.println("Digite o numero ["+i+"]:");
            vetor[i]=tc.nextInt();
            vetor2[aux]=vetor[i];
            aux--;
        }
        for(i=0; i<5; i++){
            System.out.println("Impressão Inversa: "+vetor2[i]);
        }
    }
}
