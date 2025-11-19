import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerGUI {

    private JTextField zahl1Field;
    private JTextField zahl2Field;
    private JComboBox<String> operatorComboBox;
    private JLabel ergebnisLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TaschenrechnerGUI().createAndShowGUI();
            }
        });
    }

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Taschenrechner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        zahl1Field = new JTextField();
        zahl2Field = new JTextField();
        operatorComboBox = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        ergebnisLabel = new JLabel("Ergebnis: ");

        JButton berechnenButton = new JButton("Berechnen");
        berechnenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int zahl1 = Integer.parseInt(zahl1Field.getText());
                int zahl2 = Integer.parseInt(zahl2Field.getText());
                char operator = operatorComboBox.getSelectedItem().toString().charAt(0);
                int ergebnis = berechne(zahl1, zahl2, operator);
                ergebnisLabel.setText("Ergebnis: " + ergebnis);
            }
        });

        frame.add(new JLabel("Zahl 1:"));
        frame.add(zahl1Field);
        frame.add(new JLabel("Operator:"));
        frame.add(operatorComboBox);
        frame.add(new JLabel("Zahl 2:"));
        frame.add(zahl2Field);
        frame.add(berechnenButton);
        frame.add(ergebnisLabel);

        frame.setVisible(true);
    }

    public int addieren(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public int subtrahieren(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    public int multiplizieren(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    public int dividieren(int zahl1, int zahl2) {
        if (zahl2 != 0) {
            return zahl1 / zahl2;
        } else {
            JOptionPane.showMessageDialog(null, "Division durch Null ist nicht erlaubt.");
            return 0;
        }
    }

    public int berechne(int zahl1, int zahl2, char operator) {
        switch (operator) {
            case '+':
                return addieren(zahl1, zahl2);
            case '-':
                return subtrahieren(zahl1, zahl2);
            case '*':
                return multiplizieren(zahl1, zahl2);
            case '/':
                return dividieren(zahl1, zahl2);
            default:
                JOptionPane.showMessageDialog(null, "Ungültiger Operator");
                return 0;
        }
    }
}
