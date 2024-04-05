import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ler a cotação do dolar
        System.out.println("Qual a cotação do Dólar");
        double cotacao = sc.nextDouble();
        //Ler a quantidade de dólares
        System.out.println("Quantos dólares?");
        Double dolares = sc.nextDouble();
        //Converter para real
        double real = dolares * cotacao;
        //Mostrar o resultado
        System.out.printf("Você tem o equivalente a R$ %.2f\n", real);
        sc.close();

    }
}
