package Aula9_ED1;

/**
 * Created by jrg_c on 14/09/2016.
 */
public class FilaEntrega {
    Trabalho e[] = new Trabalho[10];
    int cont=-1;

    public void init(){
        this.cont=-1;
    }
    public void cadastrar(Trabalho x){
        this.cont++;
        e[this.cont]=x;
        System.out.println("Trabalho impresso e inserido na fila de entrega.");
    }
    public boolean isEmpty(){
        if(this.cont==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void isLast(){
        System.out.println("Proximo a ser impresso:");
        System.out.println("Nome: "+e[this.cont].nome);
        System.out.println("Pedido: "+e[this.cont].npedido);
        System.out.println("Quantidade: "+e[this.cont].qtd);
        System.out.println("Previsao Entrega: "+e[this.cont].data);
    }
    public void entregar(){
        Trabalho aux = e[0];
        Trabalho auxF[] = new Trabalho[this.cont];
        for(int i=1; i<=this.cont; i++){
            auxF[i-1]=e[i];
        }
        e=auxF;
        this.cont--;
        System.out.println("Trabalho entregue ao cliente ["+aux.nome+"].");
    }
    public boolean isFull(){
        if(this.cont==e.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
