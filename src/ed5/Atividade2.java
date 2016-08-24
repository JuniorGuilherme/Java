package ed5;

/**
 * Created by jrg_c on 23/08/2016.
 */
public class Atividade2 {
    public static void main(String[] args) {
        String nome = "Junior";
        System.out.println("Numero de Vogais: "+RetornoVogal(nome));
    }
    public static int RetornoVogal(String n){
        int cont=0;
        char c;
        for(int i=0; i<n.length(); i++){
            c=n.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                cont++;
            }
        }
        return(cont);
    }
}
