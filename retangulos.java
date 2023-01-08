import javax.swing.JOptionPane;

public class retangulos {
    public static void main(String[] args) {
        float a, b, d, a1, a2, atotal;

        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura menor (em cm): ",
                "Lado menor", JOptionPane.WARNING_MESSAGE));

        d = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura maior (em cm): ",
                "Lado maior", JOptionPane.WARNING_MESSAGE));

        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura dos dois retângulos (em cm): ",
                "Altura Retangulos", JOptionPane.WARNING_MESSAGE));

        a1 = a * b;
        a2 = d * b;
        atotal = a1 + a2;

        JOptionPane.showMessageDialog(null, "Área do retângulo menor: " + a1
                + "cm²", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Área do retângulo maior: " + a2
                + "cm²", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Área total dos dois retângulos: " + atotal
                + "cm²", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
