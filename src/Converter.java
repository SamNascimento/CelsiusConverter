import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame {
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public Converter(String titulo) {
        super(titulo);

        // Definindo a ação a ser executada quando for fechado a operação, no caso a ação é de fechar o painel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Definindo o conteúdo a ser exibido
        this.setContentPane(mainPanel);
        // Empacotando o conteúdo a ser exibido
        this.pack();

        // Criando uma ação para ser executada quando o programa "ouvir"/detectar uma ação no botão
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // A ação feita será pegar o valor do TextField e passar convertido para a Label do Fahrenheit
                int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + "º Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        // Criando um Frame e definindo o título dele.
        JFrame frame = new Converter("Conversor de Celsius");

        // Definindo o Frame para deixá-lo visível
        frame.setVisible(true);


    }
}
