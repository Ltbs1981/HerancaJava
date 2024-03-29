public class AppHeranca 
{
    public static void main(String[] args) 
    {
        System.out.println("---------- Aluno -----------------------------------");
        Aluno al1 = new Aluno();
        al1.entrada();
        al1.imprimir();
        
        System.out.println("---------- Aluno -----------------------------------");
        Aluno al2 = new Aluno("1001", "João", 12, 6.76);
        al2.imprimir();
        
        System.out.println("---------- Professor -------------------------------");
        Professor pf1 = new Professor();
        pf1.entrada();
        pf1.imprimir();
        
        System.out.println("---------- Professor -------------------------------");
        Professor pf2 = new Professor("101001", "Moacir", "99900-2122", 43, 5, 3000, "Mestre");
        pf2.imprimir();
        
        System.out.println("----------Funcionário------------------------------");
        Funcionario fc1 = new Funcionario();
        fc1.entrada();
        fc1.imprimir();
        
        System.out.println("---------- funcionário -----------------------------");
        Funcionario fc2 = new Funcionario("101033", "Maria", "99900-2222", 33, 32, 6000, "Chefe Administração");
        fc2.imprimir();
    }
}
