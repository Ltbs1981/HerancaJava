import java.util.Scanner;

public class Funcionario extends Colaborador {
    String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String fun) {
        if (!fun.isEmpty()) {
            funcao = fun;
        }
    }

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, int idade, double salario, String funcao) {
        super(nome, idade, salario);
        setFuncao(funcao);
    }

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    public Funcionario(String matricula, String nome, int codigoCarreira, double salario, String funcao) {
        super(matricula, nome, codigoCarreira, salario);
        setFuncao(funcao);
    }

    public Funcionario(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario, String funcao) {
        super(matricula, nome, celular, idade, codigoCarreira, salario);
        setFuncao(funcao);
    }

    public Funcionario(String matricula, String nome, String celular, int idade) {
        super(matricula, nome, celular, idade);
    }

    public Funcionario(String matricula, String nome, String funcao) {
        super(matricula, nome);
        setFuncao(funcao);
    }

    public void cadastrar(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario, String funcao) {
        super.cadastrar(matricula, nome, celular, idade, codigoCarreira, salario);
        setFuncao(funcao);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Função :" + getFuncao());
    }

    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Função :");
        setFuncao(ent.nextLine());
        ent.close();
    }
}
