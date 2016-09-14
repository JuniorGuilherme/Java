package Aula8_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 13/09/2016.
 */
public class Fila {
    int[] vetor;
    int cont;
    Scanner tc = new Scanner(System.in);

    public void init(int t) {
        cont = -1;
        vetor = new int[t];
    }

    public void add() {
        cont++;
        System.out.println("Entre com o elemento:");
        vetor[cont] = tc.nextInt();
        System.out.println("Objeto inserido.");
    }

    public void remove() {
        int aux[] = new int[cont];
        for (int i = 1; i <= cont; i++) {
            aux[i - 1] = vetor[i];
        }
        vetor = aux;
        cont--;
        System.out.println("Objeto removido.");
    }

    public void show() {
        for (int i = 0; i <= cont; i++) {
            System.out.println("Elemento [" + (i + 1) + "]: " + vetor[i]);
        }
    }

    public boolean isFull() {
        if (cont == vetor.length - 1) {
            return true;
        } else
            return false;
    }
}
