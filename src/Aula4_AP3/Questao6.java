package Aula4_AP3;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao6 {
    public static String MaiorString (String nA, String nB){
        if(nA.length()>nB.length())
            return(nA);
        else if(nB.length()>nA.length())
            return(nB);
        else {
            String igual = "São do mesmo tamanho";
            return (igual);
        }
    }
    public static void main(String[] args) {
        String nomeA, nomeB;
        nomeA="Junior";
        nomeB="Guilherme";
        System.out.println(MaiorString(nomeA, nomeB));
    }
}
