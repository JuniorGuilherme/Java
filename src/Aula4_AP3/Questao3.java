package Aula4_AP3;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao3 {
    public static int Concatena(String n1, String n2){
        String n3;

        n3=n1+n2;
        System.out.println("Concatenação das Strings: "+n3);
        return(n3.length());
    }
    public static void main(String[] args) {
        String nomeA, nomeB;

        nomeA="Junior";
        nomeB=" Guilherme";

        System.out.println("Tamanho da String Concatenada: "+Concatena(nomeA, nomeB));
    }
}
