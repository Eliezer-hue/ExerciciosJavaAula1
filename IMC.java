import javax.swing.*;

public class IMC {
    public static void main(String[] args) {
        float peso, altura, imc;

        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso(em Kg)",
                "Título: Peso", JOptionPane.WARNING_MESSAGE));

        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua Altura(em m)",
                "Título: Altura", JOptionPane.WARNING_MESSAGE));

        imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O IMC é: " + imc
                + " Kg/m²", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
