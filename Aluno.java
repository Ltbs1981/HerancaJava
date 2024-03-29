import java.util.Scanner;

public class Aluno extends Pessoa {
    int codigoCurso;
    double cr;

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int cc) {
        if (cc >= 0) {
            codigoCurso = cc;
        }
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cra) {
        if (cra >= 0) {
            cr = cra;
        }
    }

    public Aluno() { }

    public Aluno(String matricula, String nome) {
        super(matricula, nome);
    }

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public Aluno(String matricula, String nome, int codigoCurso, double cr) {
        super(matricula, nome);
        setCodigoCurso(codigoCurso);
        setCr(cr);
    }

    public Aluno(String matricula, String nome, int idade, int codigoCurso, double cr) {
        super(matricula, nome, idade);
        setCodigoCurso(codigoCurso);
        setCr(cr);
    }

    public Aluno(String matricula, String nome, String celular, int idade, int codigoCurso, double cr) {
        super(matricula, nome, celular, idade);
        setCodigoCurso(codigoCurso);
        setCr(cr);
    }

    public void cadastrar(String matricula, String nome, String celular, int idade, int codigoCurso, double cr) {
        super.cadastrar(matricula, nome, celular, idade);
        setCodigoCurso(codigoCurso);
        setCr(cr);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Código Curso :" + getCodigoCurso());
        System.out.println("CR :" + getCr());
    }

    public void entrada() {
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Código Curso :");
        setCodigoCurso(Integer.parseInt(ent.nextLine()));
        System.out.println("CR :");
        setCr(Double.parseDouble(ent.nextLine()));
        //ent.close();
    }
}
