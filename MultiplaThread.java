import javax.swing.*;
import java.awt.event.*;

public class MultiplaThread extends JFrame {
    private JButton botao;

    public MultiplaThread() {
        super("Aplicação MultiThread");
        System.out.println("Dentro da Janela:" + Thread.activeCount());
        botao = new JButton("botão");
        this.getContentPane().add(botao);
        this.pack();
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pressionou Botão 1");
            }
        });
    }
}