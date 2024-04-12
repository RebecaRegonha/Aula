public class Salario {
    public static void main(String[] args) {
    Funcionario[] funcionarios = new Funcionario[5];
    Scanner sc = new Scanner(Sistem.in);

    for (int i = 0; i < funcionarios.lentgh; i++) {
        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("Salário: ");
        double salario = nextDouble();

        funcionarios[i] = new Funcionario(nome, salario);
    }

    double maiorsalario = 0;

    for (int i = 0; i < funcionarios.lentgh; i++) {
        double salario = funcionarios[i].getSalario();
        if (salario > maiorsalario){
            maiorsalario = salario;    
        }
    }
    System.out.println("O maior salário é: ");

    sc.close();
    }
}
