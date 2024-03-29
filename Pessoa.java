import java.util.Scanner;

public class Pessoa {
    // Atributos
    String matricula, nome, celular;
    int idade;
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String mat) {
        if (!mat.isEmpty()) {
            matricula = mat;
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String no) {
        if (!no.isEmpty()) {
            nome = no;
        }
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String cel) {
        if (!cel.isEmpty()) {
            celular = cel;
        }
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int ida) {
        if (ida >= 0) {
            idade = ida;
        }
    }
    
    public Pessoa() { }
    
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    public Pessoa(String matricula, String nome) {
        setMatricula(matricula);
        setNome(nome);
    }
    
    public Pessoa(String matricula, String nome, int idade) {
        setMatricula(matricula);
        setNome(nome);
        setIdade(idade);
    }
    
    public Pessoa(String matricula, String nome, String celular) {
        setMatricula(matricula);
        setNome(nome);
        setCelular(celular);
    }
    
    public Pessoa(String matricula, String nome, String celular, int idade) {
        setMatricula(matricula);
        setNome(nome);
        setCelular(celular);
        setIdade(idade);
    }
    
    public void cadastrar(String matricula, String nome, String celular, int idade){
        setMatricula(matricula);
        setNome(nome);
        setCelular(celular);
        setIdade(idade);
    }
    
    public void imprimir() {
        System.out.println("Matrícula :" + getMatricula());
        System.out.println("Nome :" + getNome());
        System.out.println("Celular :" + getCelular());
        System.out.println("Idade :" + getIdade());
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Matrícula :");
        setMatricula(ent.nextLine());
        System.out.println("Nome :");
        setNome(ent.nextLine());
        System.out.println("Celular :");
        setCelular(ent.nextLine());
        System.out.println("Idade :");
        setIdade(Integer.parseInt(ent.nextLine()));
        ent.close();
    }
}
