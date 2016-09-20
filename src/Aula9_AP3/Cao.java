package Aula9_AP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jrg_c on 18/09/2016.
 */
public class Cao {
    String nome, raca;
    int idade;
    char sexo, pedigree, premiacoes;
    Scanner tc = new Scanner(System.in);
    NomeSemelhante ns = new NomeSemelhante();

    public Cao cadastrar(){
        Cao c = new Cao();
        System.out.println("Nome: ");
        c.nome=tc.next();
        System.out.println("Idade: ");
        c.idade=tc.nextInt();
        System.out.println("Raça: ");
        c.raca=tc.next();
        System.out.println("Sexo:");
        c.sexo=tc.next().charAt(0);
        System.out.println("Pedigree: ");
        c.pedigree=tc.next().charAt(0);
        System.out.println("Premiações: ");
        c.premiacoes=tc.next().charAt(0);
        return c;
    }
    public void listarNS(String y, ArrayList<Cao> x){
        for(int i =0; i<x.size(); i++){
            if(ns.compareString(y, x.get(i).nome)) {
                System.out.println("Nome: " + x.get(i).nome);
                System.out.println("Idade: " + x.get(i).idade);
                System.out.println("Raça: " + x.get(i).raca);
                System.out.println("Sexo:" + x.get(i).sexo);
                System.out.println("Pedigree: " + x.get(i).pedigree);
                System.out.println("Premiações: " + x.get(i).premiacoes);
                System.out.println("");
            }
        }
    }
    public void listarNE(String y, ArrayList<Cao> x){
        for( int i=0; i<x.size(); i++){
            if(y.equalsIgnoreCase(x.get(i).nome)){
                System.out.println("Nome: " + x.get(i).nome);
                System.out.println("Idade: " + x.get(i).idade);
                System.out.println("Raça: " + x.get(i).raca);
                System.out.println("Sexo:" + x.get(i).sexo);
                System.out.println("Pedigree: " + x.get(i).pedigree);
                System.out.println("Premiações: " + x.get(i).premiacoes);
                System.out.println("");
            }
        }
    }
    public void listarPedigree(char s, ArrayList<Cao> x){
        for( int i=0; i<x.size(); i++){
            if(x.get(i).pedigree==s){
                System.out.println("Nome: " + x.get(i).nome);
                System.out.println("Idade: " + x.get(i).idade);
                System.out.println("Raça: " + x.get(i).raca);
                System.out.println("Sexo:" + x.get(i).sexo);
                System.out.println("Pedigree: " + x.get(i).pedigree);
                System.out.println("Premiações: " + x.get(i).premiacoes);
                System.out.println("");
            }
        }
    }
}
