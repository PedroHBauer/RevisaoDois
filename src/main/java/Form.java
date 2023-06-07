import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame{
    public JPanel panelMain;
    public JTextField textField1;
    public JTextField textField2;
    public JButton cancelarButton;
    public JButton logarButton;

    public Form() {

        logarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Login formSegundaTelaCadasto = new Login();
                formSegundaTelaCadasto.setContentPane(formSegundaTelaCadasto.panel1);
                formSegundaTelaCadasto.setVisible(true);
                formSegundaTelaCadasto.setSize(350, 350);

            }

        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText("");
                textField2.setText("");

            }

        });

    }

}
