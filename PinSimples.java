import javax.swing.JOptionPane;

public class PinSimples {
    public static void main(String[] args) {
        String pim = JOptionPane.showInputDialog(null,"Digite um numero");
        int numero= Integer.parseInt(pim);  
        if (numero % 4 == 0 || numero % 10 == 0){
            JOptionPane.showMessageDialog(null,"PIM" );
        }
        else {
            JOptionPane.showMessageDialog(null, numero );
        }
    
    }
}
