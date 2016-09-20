package Aula9_AP3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jrg_c on 18/09/2016.
 */
public class Canil {
    public boolean valida() {
        Scanner tc = new Scanner(System.in);
        char n;
        do {
            System.out.println("Digite S ou N: ");
            n = tc.next().toUpperCase().charAt(0);
        }
        while(n!='N' && n!='S');
        if(n=='S')
            return true;
        else
            return false;
    }
    public int validaInt(){
        Scanner tc = new Scanner(System.in);
        String cobaia;
        int op;
        do{
            cobaia=tc.next();
            if(!cobaia.matches("[0-9]{1,}")){
                System.out.println("Digite apenas numeros inteiros.");
            }
        }while(!cobaia.matches("[0-9]{1,}"));
        op=Integer.parseInt(cobaia);
        return op;
    }
    public static void main(String[] args) {
        Scanner tc =  new Scanner(System.in);
        Canil canil = new Canil();
        int op=0, flag, nFemeas, nMachos, nPre;
        String cobaia;
        ArrayList<Cao> c = new ArrayList<>();
        Cao dog = new Cao();
        do{
            System.out.println("1 == Cadastrar Cães | 2 == Remover Cão | 3 == Listar Caes | 4 == Sair do Canil");
            nFemeas=0;
            nMachos=0;
            nPre=0;
            for(int i=0; i<c.size(); i++){
                if(c.get(i).sexo=='F'){
                    nFemeas++;
                }
                else {
                    nMachos++;
                }
            }
            for(int i=0; i<c.size(); i++){
                if(c.get(i).premiacoes=='S'){
                    nPre++;
                }
            }
            System.out.println("Cães Cadastrados: "+c.size()+" | Fêmeas Cadastradas: "+nFemeas+" |  Machos Cadastrados: "+nMachos+" |  Numero Cães Premiados: "+nPre);
            op=canil.validaInt();
            flag=0;
            String pesquisa;
            switch (op){
                case 1:{
                    c.add(dog.cadastrar(c));
                }
                break;
                case 2:{
                    if(!c.isEmpty()) {
                        do {
                            System.out.println("1 == Nome Semelhante | 2 == Nome Exato | 3 == Por Pedigree | | 4 == Sair do Menu Remoção");
                            op = canil.validaInt();
                            switch (op) {
                                case 1: {
                                    System.out.println("Digite sua Busca:");
                                    pesquisa = tc.next();
                                    for(int i=0; i<c.size(); i++){
                                        if(dog.nomeSemelhante(pesquisa, c.get(i).nome)){
                                            System.out.println("Cão removido. Nome: "+c.get(i).nome);
                                            c.remove(i);
                                            flag=1;
                                        }
                                    }
                                    if(flag==0){
                                        System.out.println("Nem um cão encontrado.");
                                    }
                                }
                                break;
                                case 2: {
                                    System.out.println("Digite sua Busca");
                                    pesquisa = tc.next();
                                    for(int i=0; i<c.size(); i++){
                                        if(pesquisa.equalsIgnoreCase(c.get(i).nome)){
                                            System.out.println("Cão removido. Nome: "+c.get(i).nome);
                                            c.remove(i);
                                            flag=1;
                                        }
                                    }
                                    if(flag==0){
                                        System.out.println("Nem um cão encontrado.");
                                    }
                                }
                                break;
                                case 3: {
                                    System.out.println("Com Pedigree(S de Sim) ou Sem Pedigree(N de Não)");
                                    char p;
                                    if (canil.valida()){
                                        p='S';
                                    }
                                    else{
                                        p='N';
                                    }
                                    for(int i=0; i<c.size(); i++){
                                        if(c.get(i).pedigree==p){
                                            c.remove(i);
                                        }
                                    }
                                }
                                break;
                                case 4:{
                                    System.out.println("Menu de Remoção encerrado.");
                                }
                                break;
                                default: {
                                    System.out.println("Opção Invalida.");
                                }
                            }
                        } while (op != 4);
                    }
                    else{
                        System.out.println("Nenhum latido no canil ainda.");
                    }
                }
                op=0;
                break;
                case 3:{
                    if(!c.isEmpty()) {
                        do {
                            flag=0;
                            System.out.println("1 == Nome Semelhante | 2 == Raça | 3 == Por Pedigree | 4 == Sair do Menu Busca");
                            op = canil.validaInt();
                            switch (op) {
                                case 1: {
                                    System.out.println("Digite o Nome para Busca:");
                                    pesquisa = tc.next();
                                    for(int i=0; i<c.size(); i++){
                                        if(dog.nomeSemelhante(c.get(i).nome, pesquisa)){
                                            dog.listarCao(c.get(i));
                                            flag=1;
                                        }
                                    }
                                    if(flag==0){
                                        System.out.println("Nem um cão encontrado.");
                                    }
                                }
                                break;
                                case 2: {
                                    System.out.println("Digite a Raça para busca:");
                                    pesquisa = tc.next();
                                    for(int i=0; i<c.size(); i++){
                                        if(pesquisa.equalsIgnoreCase(c.get(i).raca)){
                                            dog.listarCao(c.get(i));
                                            flag=1;
                                        }
                                    }
                                    if(flag==0){
                                        System.out.println("Nem um cão encontrado.");
                                    }
                                }
                                break;
                                case 3: {
                                    System.out.println("Com Pedigree(S de Sim) ou Sem Pedigree(N de Não)");
                                    char p;
                                    if (canil.valida()) {
                                        p = 'S';
                                    } else {
                                        p = 'N';
                                    }
                                    for (int i = 0; i < c.size(); i++) {
                                        if (c.get(i).pedigree == p) {
                                            dog.listarCao(c.get(i));
                                            flag = 1;
                                        }
                                    }
                                    if(flag==0){
                                        System.out.println("Nem um cão encontrado.");
                                    }
                                }
                                break;
                                case 4:{
                                    System.out.println("Busca encerrada.");
                                }
                                break;
                                default: {
                                    System.out.println("Opção Invalida.");
                                }
                            }
                        } while (op != 4);
                    }
                    else{
                        System.out.println("Nenhum latido no canil ainda.");
                    }
                }
                op=0;
                break;
                case 4:{
                    System.out.println("Canil encerrado.");
                }
                break;
                default:{
                    System.out.println("Opção invalida. Tente novamente.");
                }
            }
        }while(op!=4);
    }
}