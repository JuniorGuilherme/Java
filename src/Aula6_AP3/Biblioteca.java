package Aula6_AP3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jrg_c on 09/09/2016.
 */
public class Biblioteca {
    public static Scanner tc = new Scanner(System.in);

    public static class Livro {
        String titulo, nomeAutor, sobrenomeAutor, emailAutor, nomeEditora, enderecoEditora, emailEditora;
        int nPag, nExem;
    }

    public static boolean valida() {
        Scanner tc = new Scanner(System.in);
        char n;
        do {
            System.out.println("Digite S ou N: ");
            n = tc.next().toUpperCase().charAt(0);
        }
        while (n != 'N' && n != 'S');
        if (n == 'S')
            return true;
        else
            return false;
    }

    public static String leAutor() {
        String nome;
        do {
            nome = tc.nextLine();
            if (!nome.matches("[^0-9]{2,}"))
                System.out.println("Nome invalido, tente novamente.");
        } while (!nome.matches("[^0-9]{2,}"));
        return nome;
    }

    public static String leTitulo() {
        String nome;
        do {
            nome = tc.nextLine();
            if (nome.length() < 5)
                System.out.println("Nome invalido, tente um titulo maior.");
        } while (nome.length() < 5);
        return nome;
    }

    public static String leEmail() {
        String nome;
        do {
            nome = tc.nextLine();
            if (!nome.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$"))
                System.out.println("Nome invalido, tente um titulo maior.");
        } while (!nome.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$"));
        return nome;
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList<Livro> list = new ArrayList<>();
        int op;
        String nome;
        do {
            System.out.println("Digite a opção deseja:");
            System.out.println("");
            System.out.println("1- Cadastrar Livros");
            System.out.println("2- Remover Livros");
            System.out.println("3- Editar Livros");
            System.out.println("4- Pesquisar Livros");
            System.out.println("5- Listar Livros");
            System.out.println("6- Quantia de Livros Cadastrados");
            System.out.println("7- Sair do Programa");

            do {
                op = tc.nextInt();
                if (op < 1 || op > 7)
                    System.out.println("Opção incorreta, tente novamente.");
            } while (op < 1 || op > 7);
            switch (op) {
                case 1:
                    do {

                        Livro l = new Livro();
                        System.out.println("Nome do Livro:");
                        l.titulo = leTitulo();
                        System.out.println("Numero de Paginas:");
                        l.nPag = tc.nextInt();
                        System.out.println("Numero de Exemplares:");
                        l.nExem = tc.nextInt();
                        System.out.println("Nome do Autor:");
                        l.nomeAutor = leAutor();
                        System.out.println("Sobrenome do Autor:");
                        l.sobrenomeAutor = leAutor();
                        System.out.println("Email do Autor: ");
                        l.emailAutor = leEmail();
                        System.out.println("Nome da Editora: ");
                        l.nomeEditora = tc.next();
                        System.out.println("Endereco da Editora: ");
                        l.enderecoEditora = tc.nextLine();
                        l.enderecoEditora = tc.next();
                        System.out.println("Email da Editora:");
                        l.emailEditora = leEmail();
                        list.add(l);
                        System.out.println("Deseja adicionar outro livro?");
                    } while (valida());
                    break;
                case 2: {
                    boolean flag = false;
                    do {
                        System.out.println("Digite o nome do livro a excluir:");
                        nome = tc.next();
                        for (int i = 0; i < list.size(); i++) {
                            if (nome.equals(list.get(i).titulo)) {
                                list.remove(i);
                                flag = true;
                            }
                        }
                        if (flag == true)
                            System.out.println("Livro excluido com sucesso.");
                        else
                            System.out.println("Livro não encontrado.");
                        System.out.println("Deseja excluir outro livro?");
                    } while (valida());
                    break;
                }
                case 3: {
                    boolean flag = false;
                    do {
                        System.out.println("Digite o nome do livro a ser editado:");
                        nome = tc.next();
                        for (int i = 0; i < list.size(); i++) {
                            if (nome.equals(list.get(i).titulo)) {
                                System.out.println("Nome do Livro:");
                                list.get(i).titulo = tc.next();
                                System.out.println("Nome do Livro:");
                                list.get(i).titulo = leTitulo();
                                System.out.println("Numero de Paginas:");
                                list.get(i).nPag = tc.nextInt();
                                System.out.println("Numero de Exemplares:");
                                list.get(i).nExem = tc.nextInt();
                                System.out.println("Nome do Autor:");
                                list.get(i).nomeAutor = leAutor();
                                System.out.println("Sobrenome do Autor:");
                                list.get(i).sobrenomeAutor = leAutor();
                                System.out.println("Email do Autor: ");
                                list.get(i).emailAutor = leEmail();
                                System.out.println("Nome da Editora: ");
                                list.get(i).nomeEditora = tc.next();
                                System.out.println("Endereco da Editora: ");
                                list.get(i).enderecoEditora = tc.next();
                                System.out.println("Email da Editora:");
                                list.get(i).emailEditora = leEmail();
                                flag = true;
                            }
                        }
                        if (flag == false)
                            System.out.println("Livro não encontrado.");
                        System.out.println("Deseja editar outro livro?");
                    } while (valida());
                }
                case 4: {
                    do {
                        System.out.println("Pesquisa: Titulo, Editora ou Autor");
                        nome = tc.next();
                        for (int i = 0; i < list.size(); i++) {
                            if (nome.equals(list.get(i).titulo) || nome.equals(list.get(i).nomeAutor) || nome.equals(list.get(i).nomeEditora)) {
                                System.out.println("Titulo do Livro: " + list.get(i).titulo);
                                System.out.println("Numero de Paginas: " + list.get(i).nPag);
                                System.out.println("Numero de Exemplares: " + list.get(i).nExem);
                                System.out.println("Nome do Autor: " + list.get(i).nomeAutor);
                                System.out.println("Sobrenome do Autor: " + list.get(i).sobrenomeAutor);
                                System.out.println("Email do Autor: " + list.get(i).emailAutor);
                                System.out.println("Nome da Editora: " + list.get(i).nomeEditora);
                                System.out.println("Endereço da Editora: " + list.get(i).enderecoEditora);
                                System.out.println("Email da Editora: " + list.get(i).emailEditora);
                            }
                        }
                        System.out.println("Deseja pesquisar novamente?");
                    } while (valida());
                }
                case 5: {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println("Livro[" + (i + 1) + "]: " + list.get(i).titulo);
                    }
                }
                break;
                case 6: {
                    System.out.println("Total de Livros: " + list.size());
                }
                break;
                case 7: {
                    System.out.println("Programa Encerrado.");
                }
                break;
            }
        } while (op != 7);
    }
}