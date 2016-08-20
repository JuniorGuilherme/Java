package ed3;

import java.util.Scanner;

/**
 * Created by jrg_c on 16/08/2016.
 */
public class Atividade5 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        int l=0, c=0, matriz[][]= new int [4][4], somaColuna[]= new int [4], somaLinha[]= new int [4], somaAux=0, somaTotal=0;
        for(l=0; l<4; l++){
            for(c=0; c<4;c++){
                do{
                    System.out.println("Digite o numero: ");
                    matriz[l][c]=tc.nextInt();
                    if(matriz[l][c]<0) {
                        System.out.println("Digite somente numeros positivos!");
                    }
                }
                while(matriz[l][c]<0);
                somaAux+=matriz[l][c];
                somaTotal+=matriz[l][c];
            }
            somaLinha[l]=somaAux;
            somaAux=0;
        }
        for(c=0; c<4;c++) {
            for (l = 0; l < 4; l++) {
                somaAux+=matriz[l][c];
            }
            somaColuna[c]=somaAux;
            somaAux=0;
        }
        for(int i=0; i<4;i++){
            System.out.println("Soma da Linha["+i+"]: "+somaLinha[i]);
            System.out.println("Soma da Coluna ["+i+"]: "+somaColuna[i]);
        }
        System.out.println("Soma Total:"+somaTotal);
    }

}
