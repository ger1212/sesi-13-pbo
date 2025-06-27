import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeSederhana extends JFrame {
    JButton[] buttons = new JButton[9];
    boolean giliranX = true;

    public TicTacToeSederhana() {
        setTitle("Tic Tac Toe");
        setSize(800, 800);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            add(buttons[i]);
            int finalI = i;
            buttons[i].addActionListener(e -> {
                if (buttons[finalI].getText().equals("")) {
                    buttons[finalI].setText(giliranX ? "X" : "O");
                    giliranX = !giliranX;
                }
            });
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeSederhana();
    }
}
