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

                if (textField1.getText().equals("admin") && textField2.getText().equals("admin")) {

                    Login formSegundaTelaCadasto = new Login();
                    formSegundaTelaCadasto.setContentPane(formSegundaTelaCadasto.panel1);
                    formSegundaTelaCadasto.setVisible(true);
                    formSegundaTelaCadasto.setSize(350, 350);

                }else {

                    Erro TelaErro = new Erro();
                    TelaErro.setContentPane(TelaErro.panel1);
                    TelaErro.setVisible(true);
                    TelaErro.setSize(75, 75);

                }

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