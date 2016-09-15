package ap3;

import java.util.Scanner;

/**
 * Created by jrg_c on 15/08/2016.
 */
public class Galoes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int galoes;
        double litros = 3.7854;

        System.out.println("Digite o numero de galões: ");
        galoes = tc.nextInt();
        litros = galoes * litros;
        System.out.println("Total de litros: " + litros + " litros");

    }
}
