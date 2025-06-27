import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class KuisPenjumlahan extends JFrame {
    JTextField tfAngka1, tfAngka2, tfJawaban;
    JLabel lblHasil;
    JButton btnCheck;
    int angka1, angka2;

    public KuisPenjumlahan() {
        setTitle("Kuis Penjumlahan");
        setSize(750, 550);
        setLayout(new GridLayout(4, 2));

        Random rand = new Random();
        angka1 = rand.nextInt(10) + 1;
        angka2 = rand.nextInt(10) + 1;

        tfAngka1 = new JTextField(String.valueOf(angka1));
        tfAngka2 = new JTextField(String.valueOf(angka2));
        tfJawaban = new JTextField();
        tfAngka1.setEditable(false);
        tfAngka2.setEditable(false);

        lblHasil = new JLabel("");
        btnCheck = new JButton("Check");

        add(new JLabel("Angka 1:"));
        add(tfAngka1);
        add(new JLabel("Angka 2:"));
        add(tfAngka2);
        add(new JLabel("Jawaban Anda:"));
        add(tfJawaban);
        add(btnCheck);
        add(lblHasil);

        btnCheck.addActionListener(e -> {
            try {
                int jawab = Integer.parseInt(tfJawaban.getText());
                if (jawab == (angka1 + angka2)) {
                    lblHasil.setText("Jawaban Benar!");
                    getContentPane().setBackground(Color.GREEN);
                } else {
                    lblHasil.setText("Maaf, Jawaban Anda Salah");
                    getContentPane().setBackground(Color.RED);
                }
            } catch (Exception ex) {
                lblHasil.setText("Input tidak valid");
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KuisPenjumlahan();
    }
}
