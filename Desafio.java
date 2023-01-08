import javax.swing.*;

public class Desafio {
    public static void main(String[] args) {
        String nome, sobrenome;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome",
                "Título: Nome", JOptionPane.WARNING_MESSAGE);

        sobrenome = JOptionPane.showInputDialog(null, "Digite seu sobrenome",
                "Título: Sobrenome", JOptionPane.WARNING_MESSAGE);

        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade",
                "Título: idade", JOptionPane.WARNING_MESSAGE));

        JOptionPane.showMessageDialog(null, "O nome informado é: " + nome
                + "\n O Sobrenome informado é: " + sobrenome
                + "\n A idade informada é: " + idade,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
