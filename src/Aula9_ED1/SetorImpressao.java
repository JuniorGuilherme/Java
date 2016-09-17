package Aula9_ED1;

import java.util.Scanner;

/**
 * Created by jrg_c on 14/09/2016.
 */
public class SetorImpressao {
    public static void show(Trabalho x[], int cont){
        for(int i=0; i<=cont; i++){
            System.out.println("Nome: "+x[i].nome);
            System.out.println("Pedido: "+x[i].npedido);
            System.out.println("Quantidade: "+x[i].qtd);
            System.out.println("Previsao Entrega: "+x[i].data);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int op;
        Scanner tc = new Scanner(System.in);
        FilaImpressao f = new FilaImpressao();
        FilaEntrega e = new FilaEntrega();
        f.init();
        do{
            System.out.println("1 == Cadastrar || 2 == Imprimir || 3 == Fila Impressao || 4 == Fila Entrega || 5 == Ultimo Impresso || 6 == Proximo a ser impresso || 7 == Entregar 8 == Sair");
            System.out.println("Digite uma das opcoes acima: ");
                op=tc.nextInt();
            switch(op){
                case 1:{
                    if(!f.isFull()) {
                        f.cadastro();
                    }
                    else{
                        System.out.println("Fila de impressao cheia.");
                    }
                }
                break;
                case 2:{
                    if(f.isEmpty() || e.isFull()){
                        System.out.println("Impossivel imprimir. Nenhum trabalho cadastrado ou a Fila de Entrega esta cheia.!");
                    }
                    else{
                        e.cadastrar(f.imprimir());
                    }
                }
                break;
                case 3:{
                    if(f.isEmpty()){
                        System.out.println("Fila de impressao vazia.");
                    }
                    else {
                        show(f.f, f.cont);
                    }
                }
                break;
                case 4:{
                    if(e.isEmpty()){
                        System.out.println("Fila de entrega vazia.");
                    }
                    else {
                        show(e.e, e.cont);
                    }
                }
                break;
                case 5:{
                    if(e.isEmpty()){
                        System.out.println("Nem um documento impresso ainda.");
                    }
                    else {
                        e.isLast();
                    }
                }
                break;
                case 6:{
                    if(f.isEmpty()){
                        System.out.println("Fila de impressao ainda vazia.");
                    }
                    else {
                        f.isFirst();
                    }
                }
                break;
                case 7:{

                    if(e.isEmpty()){
                        System.out.println("Nem um documento na lista de entrega ainda");
                    }
                    else {
                        e.entregar();
                    }
                }
                break;
                case 8:{
                    System.out.println("Programa encerrado.");
                }
                break;
                default:{
                    System.out.println("Opcao incorreta, tente novamente.");
                }
            }
        }while(op!=8);
    }
}
