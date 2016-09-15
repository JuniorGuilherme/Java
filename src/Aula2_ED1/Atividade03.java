package Aula2_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 10/08/2016.
 */
public class Atividade03 {
    public static void main(String[] args) {
        int vetor[] = new int[10], aux = 0, i = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            vetor[i] = teclado.nextInt();
            aux = vetor[i];
            if (vetor[0] < 1 || vetor[0] > 3) {
                System.out.println("Apenas numeros entre 1 e 3 para continuar.");
            }
        } while (vetor[0] < 1 || vetor[0] > 3);
        for (i = 1; i < 10; i++) {
            do {
                System.out.println("Digite um numero maior que o ultimo digitado (" + aux + ").");
                vetor[i] = teclado.nextInt();
            } while (vetor[i] < aux);
            aux = vetor[i];
        }
        for (i = 0; i < 10; i++) {
            System.out.println("Valor [" + i + "]: " + vetor[i]);
        }
    }
}
