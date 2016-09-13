package Aula7_ED1;

/**
 * Created by jrg_c on 06/09/2016.
 */
public class Estacionamento {
    public Car[] est = new Car[10];
    int topo;

    public void isInit(){
        topo=-1;
        System.out.println("Pilha Estacionamento iniciada.");
    }
    public void push(Car c){
        topo++;
        est[topo]=c;
        System.out.println("Carro Estacionado.");
        System.out.println(est[topo].placa);
    }
    public void exibir(){
        for(int i=0; i<=topo; i++){
            System.out.println("Carro Numero: ["+(i)+"] Placa: "+est[i].placa);
        }
    }
    public boolean pop(){
        if(topo==-1)
            return false;
        else
            topo--;
            return true;
    }
    public void top(){
        if(topo>-1)
            System.out.println("Topo ["+topo+"]: "+est[topo].placa);
        else
            System.out.println("Estacionamento vazio.");
    }
    public boolean isFull(){
        if(topo==9)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
        if(topo==-1)
            return true;
        else
            return false;
    }
}
