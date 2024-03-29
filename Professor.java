import java.util.Scanner;

public class Professor extends Colaborador {
    String titulacao;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String tit) {
        if (!tit.isEmpty()) {
            titulacao = tit;
        }
    }

    public Professor() {
        super();
    }

    public Professor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public Professor(String nome, int idade, String titulacao) {
        super(nome, idade);
        setTitulacao(titulacao);
    }

    public Professor(String matricula, String nome, int codigoCarreira, double salario, String titulacao) {
        super(matricula, nome, codigoCarreira, salario);
        setTitulacao(titulacao);
    }

    public Professor(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario, String titulacao) {
        super(matricula, nome, celular, idade, codigoCarreira, salario);
        setTitulacao(titulacao);
    }

    public Professor(String matricula, String nome, String celular, int idade, String titulacao) {
        super(matricula, nome, celular, idade);
        setTitulacao(titulacao);
    }

    public Professor(String matricula, String nome, String titulacao) {
        super(matricula, nome);
        setTitulacao(titulacao);
    }

    public void cadastrar(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario, String titulacao) {
        super.cadastrar(matricula, nome, celular, idade, codigoCarreira, salario);
        setTitulacao(titulacao);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Titulação :" + getTitulacao());
    }

    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Titulação :");
        setTitulacao(ent.nextLine());
        //ent.close();
    }
}
