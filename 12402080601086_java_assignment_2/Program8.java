import javax.swing.*;
import java.awt.event.*;

public class Program8 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton btn;

    Program8() {
        setTitle("Investment Calculator");
        setSize(300, 300);
        setLayout(null);

        // Labels
        l1 = new JLabel("Principal:");
        l2 = new JLabel("Rate (%):");
        l3 = new JLabel("Time (years):");
        l4 = new JLabel("Result:");

        // TextFields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t4.setEditable(false);

        // Button
        btn = new JButton("Calculate");
        btn.addActionListener(this);

        // Set positions
        l1.setBounds(20, 20, 100, 25);
        t1.setBounds(130, 20, 100, 25);

        l2.setBounds(20, 60, 100, 25);
        t2.setBounds(130, 60, 100, 25);

        l3.setBounds(20, 100, 100, 25);
        t3.setBounds(130, 100, 100, 25);

        l4.setBounds(20, 140, 100, 25);
        t4.setBounds(130, 140, 100, 25);

        btn.setBounds(80, 180, 120, 30);

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(t1.getText());
            double r = Double.parseDouble(t2.getText());
            double t = Double.parseDouble(t3.getText());

            // Simple Interest Calculation
            double si = (p * r * t) / 100;

            t4.setText(String.valueOf(si));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new Program8();
    }
}
