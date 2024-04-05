import javax.swing.JOptionPane;

public class Dirigir {
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        int numero = Integer.parseInt(idade);    
        if (numero < 18){
           JOptionPane.showMessageDialog(null,"Menor de idade, não pode dirigir");
        }
        else {
            JOptionPane.showMessageDialog(null,"Maior de idade, pode dirigir");
        }
        
    }
}
