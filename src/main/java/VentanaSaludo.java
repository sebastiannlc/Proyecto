import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

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
        crearComponentes();
        configurarEstilos();
        asignarEventos();
        agregarComponentes();
    }

    private void crearComponentes() {
        campoTexto = new JTextField();
        campoTexto.setBounds(50, 40, 250, 30);

        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(310, 40, 100, 30);

        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 90, 350, 30);
    }

    private void configurarEstilos() {
        Font fuente = new Font("Arial", Font.BOLD, 14);
        campoTexto.setFont(fuente);
        botonSaludar.setFont(fuente);
        etiquetaSaludo.setFont(fuente);

        etiquetaSaludo.setBackground(Color.LIGHT_GRAY);
        etiquetaSaludo.setOpaque(true);
    }

    private void asignarEventos() {
        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();

            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa tu nombre.");
            } else {
                etiquetaSaludo.setText("¡Hola, " + nombre + "!");
            }
        });

        campoTexto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick();
                }
            }
        });
    }

    private void agregarComponentes() {
        add(campoTexto);
        add(botonSaludar);
        add(etiquetaSaludo);
    }

    private void configurarVentana() {
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(200, 220, 240));
    }

    public static void main(String[] args) {
        VentanaSaludo ventana = new VentanaSaludo("App de Saludo ICC490");
        ventana.setVisible(true);
    }
}