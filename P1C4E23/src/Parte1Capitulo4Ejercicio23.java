import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.*;

public class Parte1Capitulo4Ejercicio23 {
    private JPanel MainMenu;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JButton btncal;
    private JLabel lblEcuacion;
    private JLabel lblRespuestaA;
    private JButton btnClear;
    private JLabel lblRespuestaB;
    private JLabel lblResultado;

    public Parte1Capitulo4Ejercicio23() {
        btncal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double A,B,C;
                if (txtA.getText().length() == 0 || Integer.parseInt(txtA.getText()) == 0){
                    txtA.setText("Ingrese un valor diferente de 0");
                }else {
                    if(txtB.getText().length() == 0){
                        txtB.setText("0");
                    }if(txtC.getText().length() == 0){
                        txtC.setText("0");
                    }
                    A = Double.parseDouble(txtA.getText());
                    B = Double.parseDouble(txtB.getText());
                    C = Double.parseDouble(txtC.getText());
                    lblEcuacion.setText(txtA.getText()+"x² + "+txtB.getText()+"x + "+txtC.getText()+" = 0");
                    lblResultado.setText("Soluciones:");
                    lblRespuestaA.setText("X_1: " + SolEcu(A,B,C,0));
                    lblRespuestaB.setText("X_2: " + SolEcu(A,B,C,1));
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                lblRespuestaA.setText("Calculando...");
                lblEcuacion.setText("Ax² + Bx + C = 0");
                lblResultado.setText("");
                lblRespuestaB.setText("");
            }
        });
    }

    public String SolEcu(double A,double B, double C,int POS){
        double[] SolNum = new double[2];
        String[] SolStr = new String[2];
        double PN,PI;
        double a = pow(B, 2) - 4 * A * C;
        if (a < 0){
            PN = -B/(2*A);
            PI = sqrt(abs(a))/(2*A);
            SolStr[0] = PN + " + " + PI + "i";
            SolStr[1] = PN + " - " + PI + "i";
        }else{
            SolNum[0] = (-B + sqrt(a))/(2*A);
            SolNum[1] = (-B - sqrt(a))/(2*A);
            SolStr[0] = String.valueOf(SolNum[0]);
            SolStr[1] = String.valueOf(SolNum[1]);
        }
        return SolStr[POS];
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("Ecuación de segundo grado");
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.setContentPane(new Parte1Capitulo4Ejercicio23().MainMenu);
        Menu.pack();
        Menu.setSize(300,300);
        Menu.setVisible(true);
    }
}
