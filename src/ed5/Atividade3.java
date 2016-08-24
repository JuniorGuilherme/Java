package ed5;

/**
 * Created by jrg_c on 23/08/2016.
 */
public class Atividade3 {
    public static void main(String[] args) {
        int n = 4;
        if(ParImpar(n)==0){
            System.out.println("É par.");
        }
        else if(ParImpar(n)==1){
            System.out.println("É impar.");
        }
    }
    public static int ParImpar (int num){
        if(num%2==0){
            return(0);
        }
        else{
            return(1);
        }
    }
}
