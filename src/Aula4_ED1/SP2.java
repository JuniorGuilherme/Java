package Aula4_ED1;

/**
 * Created by Junior Guilherme on 23/08/2016.
 */
public class SP2 {
    public static void main(String[] args) {
        int vetorA[] = {15, 44, 23, 1, 0, 18, 17, 37, 35, 54};
        int vetorB[] = {32, 115, 48, 55, 51, 0, -48, 85, 15, 99};
        int matriz[][] = new int[4][10], l, c, flag = 0;

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 10; c++) {
                if (l == 0)
                    matriz[l][c] = vetorA[c] * vetorB[c];
                else if (l == 1)
                    matriz[l][c] = vetorA[c] + vetorB[c];
                else if (l == 2)
                    matriz[l][c] = vetorA[c] - vetorB[c];
                else if (l == 3) {
                    int i;
                    for (i = 0; i < vetorA.length; i++) {
                        for (int f = 0; f < vetorB.length; f++) {
                            if (vetorA[i] == vetorB[f]) {
                                flag = 2;
                            } else {
                                flag = 0;
                            }
                        }
                        if (flag == 0) {
                            matriz[l][c] = vetorA[i];
                        }
                    }
                }
            }
        }
        for (l = 0; l < 4; l++)
            for (c = 0; c < 10; c++) {
                if (l == 0) {
                    System.out.println("Multiplicacao Matriz[" + l + "][" + c + "]: " + matriz[l][c]);
                } else if (l == 1) {
                    System.out.println("Soma Matriz[" + l + "][" + c + "]: " + matriz[l][c]);
                } else if (l == 2) {
                    System.out.println("Subtracao Matriz[" + l + "][" + c + "]: " + matriz[l][c]);
                } else if (l == 3) {
                    System.out.println("Uniao Matriz[" + l + "][" + c + "]: " + matriz[l][c]);
                }
            }
    }
}
