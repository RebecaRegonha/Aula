import javax.swing.JOptionPane;

public class Ola {
    public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog("Diga o seu nome");
        JOptionPane.showMessageDialog(null, "O seu nome é:" + nome);
    }
}