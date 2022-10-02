import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;

public class Ejercicio19 {
    private JPanel MainMenu;
    private JTextField txtLado;
    private JButton btnComprobar;
    private JLabel lblLado;
    private JLabel lblPerimetro;
    private JLabel lblAltura;
    private JLabel lblArea;

    public Ejercicio19() {
        btnComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Lado, Perimetro, Altura, Area;
                Lado = Double.parseDouble(txtLado.getText());
                Perimetro = Lado + Lado + Lado;
                Area = (Lado * Lado) / 2;
                Altura = (sqrt(3) * Lado) / 2;
                lblLado.setText("Triangulo equilatero de lado: " + Lado);
                lblPerimetro.setText("Perimetro: " + Perimetro);
                lblAltura.setText("Altura: " + Altura);
                lblArea.setText("Area: " + Area);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PERIMETRO, ALTURA Y AREA DE UN TRIANGULO EQUILATERO");
        frame.setContentPane(new Ejercicio19().MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(350,170);
        frame.setVisible(true);
    }
}
