package Aula5_AP3;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 04/09/2016.
 */
public class Input {
    public Scanner tc = new Scanner(System.in);
    public String Metodo1(){
        String n;
        do{
            System.out.println("Digite S ou N: ");
            n=this.tc.next().toUpperCase();
        }
        while (!n.equals("N") && !n.equals("S"));
        return n;
    }
    public int Metodo2() {
        int num;
        do{
            System.out.println("Digite o Numero 2:");
            num=this.tc.nextInt();
        }while(num!=2);
        return num;
    }
    public double Metodo3(){
        double num=0;
        int flag=0;
            try {
                System.out.println("Digite um Double: ");
                num = this.tc.nextDouble();
            }catch (java.util.InputMismatchException e) {
                System.out.println("Digite apenas numeros do tipo Double.");
                flag=1;
            }
        return num;
    }
    public String Metodo6(){
        String nome;
        System.out.println("Digite um nome:");
        nome=this.tc.nextLine();
        nome=this.tc.next();
        while(nome.length()<4){
            System.out.println("Digite uma palavra com mais de 3 caracteres:");
            nome=this.tc.next();
        }
        return nome;
    }
    public String Metodo7(){
        int numChar;
        String nome;
        do{
            System.out.println("Digite o numero minimo de carcteres na String a ser lida:");
            numChar=this.tc.nextInt();
        }while(numChar<1);
        System.out.println("Digite a string:");
        nome=this.tc.next();
        while(nome.length()<numChar){
            System.out.println("Digite uma String maior que "+numChar+" caracteres.");
            nome=this.tc.next();
        }
        return nome;
    }
    public String Metodo8(){
        String nome;
        boolean flag=false;
        do{
            System.out.println("Digite um nome com @:");
            nome=this.tc.next();
            for(int i=0; i<nome.length(); i++){
                if(nome.charAt(i)=='@')
                    flag=true;
            }
        }while(flag==false);
        return nome;
    }
    public String Metodo9(char c){
        String nome;
        boolean flag=false;
        do{
            System.out.println("Digite um nome com %:");
            nome=this.tc.next();
            for(int i=0; i<nome.length(); i++){
                if(nome.charAt(i)==c)
                    flag=true;
            }
        }while(flag==false);
        return nome;
    }
    public int Metodo10(int n1, int n2){
        int num=0;
        do{
            if(num<=n1 && num<=n2)
                num++;
        }while(num<=n1 && num<=n2);
        return num;
    }

    public static void main(String[] args) {
        Input mt = new Input();
        char c='%';
        System.out.println("Teste do Metodo 1: "+mt.Metodo1());
        System.out.println("Teste do Metodo 2: "+mt.Metodo2());
        System.out.println("Teste do Metodo 3: "+mt.Metodo3());
        System.out.println("Teste do Metodo 6: "+mt.Metodo6());
        System.out.println("Teste do Metodo 7: "+mt.Metodo7());
        System.out.println("Teste do Metodo 8: "+mt.Metodo8());
        System.out.println("Teste do Metodo 9: "+mt.Metodo9(c));
        System.out.println("Teste do Metodo 10: "+mt.Metodo10(15,20));
    }
}
