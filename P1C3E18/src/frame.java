import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame {
    // Los objetos se crean como atribuots o partes del programa
    private JPanel pnlMypanel;
    private JButton btnComprobar;
    private JTextField txtCodigo;
    private JTextField txtPorcentajeRetencion;
    private JTextField txtNombre;
    private JTextField txtHorasMes;
    private JTextField txtValorHora;
    private JLabel txtRDatos;
    private JLabel txtRSalarioBruto;
    private JLabel txtRSalarioNeto;
    private JLabel lblResult;

    public frame() {
        //Procedimientos para realizar tras clikear en el botón
        btnComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ValorHora,HorasMes;
                float PorcentajeRetencion,SalarioNeto,SalarioBruto;
                PorcentajeRetencion = Float.parseFloat(txtPorcentajeRetencion.getText());
                ValorHora = Integer.parseInt(txtValorHora.getText());
                HorasMes = Integer.parseInt(txtHorasMes.getText());

                PorcentajeRetencion = PorcentajeRetencion/100;
                SalarioBruto = HorasMes * ValorHora;
                SalarioNeto = SalarioBruto * (1 - PorcentajeRetencion);

                txtRDatos.setText(txtCodigo.getText() + " - " + txtNombre.getText());
                txtRSalarioBruto.setText("Salario Bruto de: " + SalarioBruto + "$");
                txtRSalarioNeto.setText( "Salario Neto de: " + SalarioNeto + "$");
            }
        });
    }

    //Main, Para crear lo correspondiente a la ventana.
    public static void main(String[] args) {
        JFrame frame = new JFrame("Trabajador y su Salario");
        frame.setContentPane(new frame().pnlMypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}
