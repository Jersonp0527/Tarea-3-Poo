import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parte1Capitulo4Ejercicio7 {
    private JTextField txtNI;
    private JTextField txtES;
    private JTextField txtPAT;
    private JTextField txtNOM;
    private JButton btnCALC;
    private JPanel MainMenu;
    private JTextArea txtRESULTS;

    public Parte1Capitulo4Ejercicio7() {
        btnCALC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Declaramos y asignamos valores
                float ES, PAT, PAGMAT = 50000;
                PAT = Float.parseFloat(txtPAT.getText());
                ES = Float.parseFloat(txtES.getText());

                //Comprobamos
                if (PAT > 2000000 && ES > 3){
                    PAGMAT = (float) (PAGMAT + 0.03 * PAT);
                }

                //Imprimimos
                txtRESULTS.setText("El estudiante con numero de incripción " + txtNI.getText() + " y nombre " + txtNOM.getText() + " debe pager $" + PAGMAT);
            }
        });
    }

    //Instanciamos los paneles
    public static void main(String[] args) {
        JFrame Menu = new JFrame("Pago de Matrícula");
        Menu.setContentPane(new Parte1Capitulo4Ejercicio7().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(500,300);
        Menu.setVisible(true);
    }
}
