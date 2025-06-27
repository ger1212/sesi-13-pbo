import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AritmatikaSederhana extends JFrame {
    JTextField tf1, tf2, tfHasil;
    JButton tambah, kurang, kali, bagi, modulus;

    public AritmatikaSederhana() {
        setTitle("Aritmatika Sederhana");
        setSize(700, 500);
        setLayout(new GridLayout(4, 2));

        tf1 = new JTextField();
        tf2 = new JTextField();
        tfHasil = new JTextField();
        tfHasil.setEditable(false);

        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        modulus = new JButton("MOD");
       

        add(new JLabel("Bilangan 1:"));
        add(tf1);
        add(new JLabel("Bilangan 2:"));
        add(tf2);
        add(new JLabel("Hasil:"));
        add(tfHasil);

        JPanel panelTombol = new JPanel();
        panelTombol.add(tambah);
        panelTombol.add(kurang);
        panelTombol.add(kali);
        panelTombol.add(bagi);
        panelTombol.add(modulus);
        add(panelTombol);

        // Event handler
        ActionListener listener = e -> {
            try {
                double a = Double.parseDouble(tf1.getText());
                double b = Double.parseDouble(tf2.getText());
                double hasil = 0;
                if (e.getSource() == tambah) hasil = a + b;
                else if (e.getSource() == kurang) hasil = a - b;
                else if (e.getSource() == kali) hasil = a * b;
                else if (e.getSource() == bagi) hasil = a / b;

                tfHasil.setText(String.valueOf(hasil));
            } catch (Exception ex) {
                tfHasil.setText("Error!");
            }
        };

        tambah.addActionListener(listener);
        kurang.addActionListener(listener);
        kali.addActionListener(listener);
        bagi.addActionListener(listener);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AritmatikaSederhana();
    }
}
