import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Parte1Capitulo4Ejercicio22 {

    private JPanel MainMenu;
    private JTextField txtNombre;
    private JTextField txtSalarioHora;
    private JTextField txtHorasTabajadas;
    private JButton btnEnviar;
    private JButton btnClear;
    private JLabel horasTrabajadasLabel;
    private JLabel lblResultados;

    public Parte1Capitulo4Ejercicio22() {
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNombre.getText().length() == 0 || txtSalarioHora.getText().length() == 0 || txtHorasTabajadas.getText().length() == 0) {
                    lblResultados.setText("Datos incompletos");
                } else if (SalarioMensual(Integer.parseInt(txtHorasTabajadas.getText()), Integer.parseInt(txtSalarioHora.getText())) <= 450000) {
                    lblResultados.setText(txtNombre.getText() + " - " + SalarioMensual(Integer.parseInt(txtHorasTabajadas.getText()), Integer.parseInt(txtSalarioHora.getText())) + "$");
                } else {
                    lblResultados.setText(txtNombre.getText());
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
                txtHorasTabajadas.setText("");
                txtSalarioHora.setText("");
                lblResultados.setText("Procesando...");
            }
        });
    }

    public int SalarioMensual(int HorasTrabajadas, int SalarioMensual){
        return HorasTrabajadas * SalarioMensual;
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("");
        Menu.setContentPane(new Parte1Capitulo4Ejercicio22().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(500,500);
        Menu.setVisible(true);
    }

}
