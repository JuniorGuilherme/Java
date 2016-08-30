package Aula4_AP3;

/**
 * Created by jrg_c on 29/08/2016.
 */
public class Questao1 {
    public static int retorna(String n) {
        return(n.length());
    }
    public static void main(String[] args) {
        String nome = "Junior Guilherme";
        int tam=0;
        tam=retorna(nome);

        System.out.println("A String possui: "+tam+" caracteres.");

    }

}
