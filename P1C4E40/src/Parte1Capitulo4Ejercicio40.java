import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Parte1Capitulo4Ejercicio40 {
    private JTextArea txtGroup;
    private JPanel MainMenu;
    private JTextArea txtRC;
    private JTextArea txtCuadrado;
    private JTextArea txtCubo;
    private JButton calcularButton;
    private JButton btnLimpiar;

    public Parte1Capitulo4Ejercicio40() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRC.setText("");
                txtCuadrado.setText("");
                txtCubo.setText("");
                String Lineas[];
                Lineas = txtGroup.getText().split("\n");

                for (int i = 0; i < Lineas.length; i++) {
                    if (Integer.parseInt(Lineas[i]) < 0){
                        txtRC.setText(txtRC.getText() + "Valor Indeterminado" + "\n");
                    }else {
                        txtRC.setText(txtRC.getText() + String.valueOf(sqrt(Integer.parseInt(Lineas[i]))) + "\n");
                    }
                    txtCubo.setText(txtCubo.getText() + String.valueOf(pow(Integer.parseInt(Lineas[i]),3)) + "\n");
                    txtCuadrado.setText(txtCuadrado.getText() + String.valueOf(pow(Integer.parseInt(Lineas[i]),2)) + "\n");
                }
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCuadrado.setText("");
                txtCubo.setText("");
                txtRC.setText("");
                txtGroup.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame Menu = new JFrame("Raíz, Cubo y Cruadrado - Lista");
        Menu.setContentPane(new Parte1Capitulo4Ejercicio40().MainMenu);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu.pack();
        Menu.setSize(800,500);
        Menu.setVisible(true);
    }
}
