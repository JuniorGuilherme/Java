package ap3;

import java.util.Scanner;

/**
 * Created by jrg_c on 15/08/2016.
 */
public class GaloesModificado {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double valorGalao = 3.7854;
        int aux = 9;
        for (int i = 0; i < 100; i++) {
            System.out.println("Conversão de [" + i + "] galões: " + i * valorGalao);
            if (i == aux) {
                System.out.println("");
                aux += 10;
            }
        }
    }
}
