package Aula4_ED1;

/**
 * Created by jrg_c on 23/08/2016.
 */
class Consoante {
    int n;
}

public class Atividade4 {
    public static void main(String[] args) {
        String nome = "Notebook";
        Consoante ncon = new Consoante();
        ncon.n = 100;
        Troca(ncon, nome);
        System.out.println("NUmero de consoantes: " + ncon.n);
    }

    public static void Troca(Consoante n, String plvr) {
        char c;
        int cont = 0;
        for (int i = 0; i < plvr.length(); i++) {
            c = plvr.charAt(i);
            if (c != 'a' & c != 'e' & c != 'i' & c != 'o' & c != 'u') {
                cont++;
            }
        }
        n.n = cont;
    }
}
