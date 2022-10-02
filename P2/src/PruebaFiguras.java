import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaFiguras {
    private JPanel MainMenu;
    private JButton btnCirculo;
    private JButton btnRectangulo;
    private JButton btnCuadrado;
    private JButton btnTrianguloRectangulo;
    private JTextField txtRCirculo;
    private JTextField txtBRectangulo;
    private JTextField txtARectangulo;
    private JTextField txtLCuadrado;
    private JTextField txtBTR;
    private JLabel lblACirculo;
    private JLabel lblPCirculo;
    private JLabel lblARectangulo;
    private JLabel lblPRectangulo;
    private JLabel lblACuadrado;
    private JLabel lblPCuadrado;
    private JLabel lblATR;
    private JLabel lblPTR;
    private JLabel lblTTR;
    private JTextField txtATR;

    public PruebaFiguras() {
        btnCirculo.addActionListener(e -> {
            Circulo figura1 = new Circulo(Integer.parseInt(txtRCirculo.getText()));
            lblACirculo.setText(String.valueOf(figura1.calcularArea()));
            lblPCirculo.setText(String.valueOf(figura1.calcularPerimetro()));
        });
        btnRectangulo.addActionListener(e -> {
            Rectangulo figura2 = new Rectangulo(Integer.parseInt(txtBRectangulo.getText()),Integer.parseInt(txtARectangulo.getText()));
            lblARectangulo.setText(String.valueOf(figura2.calcularArea()));
            lblPRectangulo.setText(String.valueOf(figura2.calcularPerimetro()));
        });
        btnCuadrado.addActionListener(e -> {
            Cuadrado figura3 = new Cuadrado(Integer.parseInt(txtLCuadrado.getText()));
            lblACuadrado.setText(String.valueOf(figura3.calcularArea()));
            lblPCuadrado.setText(String.valueOf(figura3.calcularPerimetro()));

        });
        btnTrianguloRectangulo.addActionListener(e -> {
            TrianguloRectangulo figura4 = new TrianguloRectangulo(Integer.parseInt(txtBTR.getText()),Integer.parseInt(txtATR.getText()));
            lblATR.setText(String.valueOf(figura4.calcularArea()));
            lblPTR.setText(String.valueOf(figura4.calcularPerimetro()));
            lblTTR.setText(figura4.determinarTipoTriangulo());
        });
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("Figuras");
        Menu.setContentPane(new PruebaFiguras().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(750,300);
        Menu.setVisible(true);
    }

}
