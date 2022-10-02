import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parte1Clase4Ejercicio41 {
    private JTextArea txtGroup;
    private JPanel MainMenu;
    private JButton btnCalc;
    private JLabel lblResult;

    public Parte1Clase4Ejercicio41() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Num[] = txtGroup.getText().split("\n");
                int May = 0;
                for (int i = 0; i < Num.length; i++) {
                    if (May < Integer.parseInt(Num[i])){
                        May = Integer.parseInt(Num[i]);
                    }
                }
                lblResult.setText(String.valueOf(May));
            }
        });
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("Mayor");
        Menu.setContentPane(new Parte1Clase4Ejercicio41().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(500,500);
        Menu.setVisible(true);
    }
}
