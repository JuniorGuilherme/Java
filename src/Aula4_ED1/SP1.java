package Aula4_ED1;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 20/08/2016.
 */
public class SP1 {
    public static void main(String[] args) {
        int temp[] = new int[7], soma = 0;
        Scanner tc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a temperatura do dia " + (i + 1) + " :");
            temp[i] = tc.nextInt();
            soma += temp[i];
        }
        soma = soma / 7;
        for (int i = 0; i < 7; i++) {
            if (temp[i] > soma) {
                System.out.println("Dia " + (i + 1) + " esteve com a temperatura acima da media: " + temp[i]);
            }
        }
    }
}
