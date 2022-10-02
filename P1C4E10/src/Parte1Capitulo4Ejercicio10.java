import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parte1Capitulo4Ejercicio10 {
    private JTextField txtA;
    private JTextField txtB;
    private JButton btnCOMPARAR;
    private JLabel txtRESULTS;
    private JPanel MainMenu;

    public Parte1Capitulo4Ejercicio10() {
        btnCOMPARAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int A = Integer.parseInt(txtA.getText()),B = Integer.parseInt(txtB.getText());
                if (A > B){
                    txtRESULTS.setText("A ES MAYOR QUE B");
                }else {
                    if (A == B){
                        txtRESULTS.setText("A ES IGUAL A B");
                    }else {
                        txtRESULTS.setText("A ES MENOR QUE B");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("Comparar A y B");
        Menu.setContentPane(new Parte1Capitulo4Ejercicio10().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(200,125);
        Menu.setVisible(true);
    }
}
