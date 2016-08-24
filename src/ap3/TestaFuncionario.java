package ap3;

/**
 * Created by jrg_c on 24/08/2016.
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcA = new Funcionario();
        Funcionario funcB = new Funcionario();

        funcA.nome = "Junior Guilherme";
        funcA.salario = 5990.75;
        funcB.nome = "Sibeli";
        funcB.salario = 7980.97;

        System.out.println("Nome do Funcionario A: "+funcA.nome);
        System.out.println("Salario do Funcionario A: "+funcA.salario);
        System.out.println("Nome do Funcionario B: "+funcB.nome);
        System.out.println("Salario do Funcionario B: "+funcB.salario);
    }
}