import javax.swing.*;

public class Exemplo1 {
    public static void main(String[] args) {

        // declarando uma varialvel do tipo inteiro
        int valor1;

        // declarando varias variaveis do mesmo tipo
        // int p1, p2, p3;

        // declarando uma variavel do tipo caractere
        String endereco;

        endereco = JOptionPane.showInputDialog(null, "Digite seu endereço",
                "Título: Endereço", JOptionPane.WARNING_MESSAGE);

        // atribuindo um valor a variavel - comando de entrada de dados.
        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número",
                "Título: Soma valores", JOptionPane.WARNING_MESSAGE));

        // Comando de saída de dados - "escreva"
        JOptionPane.showMessageDialog(null, "O valor guardado na variável é " + valor1
                + "\n O endereço digitado é " + endereco,
                "Título", JOptionPane.INFORMATION_MESSAGE);

    }
}