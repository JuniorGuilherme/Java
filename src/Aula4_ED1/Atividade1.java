package Aula4_ED1;

/**
 * Created by jrg_c on 23/08/2016.
 */
public class Atividade1 {
    public static int SomaVetor(int b[]) {
        int soma = 0;
        for (int i = 0; i < b.length; i++) {
            soma += b[i];
        }
        return (soma);
    }

    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5};
        System.out.println("Soma dos Vetores: " + SomaVetor(vetor));
    }
}
