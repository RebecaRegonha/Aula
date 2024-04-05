import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base do retangulo: ");
        double base = teclado.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = teclado.nextDouble();
        double area = base * altura;
        System.out.println("A area do retangulo é: " + area);
        teclado.close();

    }
}
