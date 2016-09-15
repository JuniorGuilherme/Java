package ap3;

import java.util.Scanner;

/**
 * Created by jrg_c on 15/08/2016.
 */
public class pesoLua {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double peso;
        System.out.println("Insira seu peso: ");
        peso = tc.nextDouble();
        peso = peso * 0.17;
        System.out.println("Seu peso na Lua: " + peso);
    }
}
