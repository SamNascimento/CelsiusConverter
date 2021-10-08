import javax.swing.*;

public class Converter extends JFrame {
    private JPanel mainPanel;

    public Converter(String titulo) {
        super(titulo);

        // Definindo a ação a ser executada quando for fechado a operação, no caso a ação é de fechar o painel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Definindo o conteúdo a ser exibido
        this.setContentPane(mainPanel);
        // Empacotando o conteúdo a ser exibido
        this.pack();
    }

    public static void main(String[] args) {
        // Criando um Frame e definindo o título dele.
        JFrame frame = new Converter("Conversor de Celsius");

        // Definindo o Frame para deixá-lo visível
        frame.setVisible(true);
    }
}
