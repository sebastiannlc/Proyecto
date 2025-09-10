import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class VentanaSaludo extends JFrame {

    private JTextField campoTexto;
    private JButton botonSaludar;
    private JLabel etiquetaSaludo;

    public VentanaSaludo(String titulo) {
        super(titulo);
        inicializarComponentes();
        configurarVentana();
    }

    private void inicializarComponentes() {
        campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        etiquetaSaludo.setBackground(Color.LIGHT_GRAY);
        etiquetaSaludo.setOpaque(true);

        Font fuente = new Font("Arial", Font.BOLD,18 );
        campoTexto.setFont(fuente);
        botonSaludar.setFont(fuente);
        etiquetaSaludo.setFont(fuente);

        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            etiquetaSaludo.setText("Hola, " + nombre );
        });

        add(campoTexto);
        add(botonSaludar);
        add(etiquetaSaludo);
    }

    private void configurarVentana() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(200,220,240));
    }

    public static void main(String[] args) {
        VentanaSaludo ventana = new VentanaSaludo("App de Saludo ICC490");
        ventana.setVisible(true);
    }
}