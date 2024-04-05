import javax.swing.JOptionPane;

public class SomaN {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n"));
        for (int i = 1; i <= n; i++){
            int fatorial = 1;
            for (int parcfatorial = i; parcfatorial >= 2; parcfatorial --){
                fatorial *= parcfatorial;
            }
            double parcelaSoma = 1 /(double) fatorial;
            System.out.println("i: " + i + "fatorial: " + fatorial + "parcelaSoma:" + parcelaSoma);
        }
    }
}
