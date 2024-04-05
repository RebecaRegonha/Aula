import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do ingressso?");
        double ValorIngresso = leitor.nextDouble();
        System.out.println("Digite a sua idade:");
        int idade = leitor.nextInt();
        if (idade<2) 
        System.out.println("O valor é: Grátis");
        else if (idade>2 && idade<=18 || idade >65)
        System.out.println("O valor é:" + ValorIngresso/2);
        else System.out.println("O valor é:" + ValorIngresso);
    

        leitor.close();
        
    }    

}
