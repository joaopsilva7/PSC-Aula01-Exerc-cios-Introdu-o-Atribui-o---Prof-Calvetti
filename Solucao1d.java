import javax.swing.JOptionPane;

public class Solucao1d {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + " kg.");
    }
}