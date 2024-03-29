import java.util.Scanner;

public class Colaborador extends Pessoa {
    int codigoCarreira;
    double salario;

    public int getCodigoCarreira() {
        return codigoCarreira;
    }

    public void setCodigoCarreira(int cc) {
        if (cc >= 0) {
            codigoCarreira = cc;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double sal) {
        if (sal >= 0) {
            salario = sal;
        }
    }

    public Colaborador() {
        super();
    }

    public Colaborador(String matricula, String nome) {
        super(matricula, nome);
    }

    public Colaborador(String nome, int idade) {
        super(nome, idade);
    }

    public Colaborador(String nome, int idade, double salario) {
        super(nome, idade);
        setSalario(salario);
    }

    public Colaborador(String matricula, String nome, int codigoCarreira, double salario) {
        super(matricula, nome);
        setCodigoCarreira(codigoCarreira);
        setSalario(salario);
    }

    public Colaborador(String matricula, String nome, String celular, int idade) {
        super(matricula, nome, celular, idade);
    }

    public Colaborador(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario) {
        super(matricula, nome, celular, idade);
        setCodigoCarreira(codigoCarreira);
        setSalario(salario);
    }

    public void cadastrar(String matricula, String nome, String celular, int idade, int codigoCarreira, double salario) {
        super.cadastrar(matricula, nome, celular, idade);
        setCodigoCarreira(codigoCarreira);
        setSalario(salario);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Código Carreira:" + getCodigoCarreira());
        System.out.println("Salário :" + getSalario());
    }

    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Código Carreira:");
        setCodigoCarreira(Integer.parseInt(ent.nextLine()));
        System.out.println("Salário :");
        setSalario(Double.parseDouble(ent.nextLine()));
        ent.close();
    }
}
