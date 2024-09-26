//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Einput extends JDialog {
    private JTextField tname;
    private JTextField told;
    private JTextField tbu;
    private JTextField tadd;
    private JTextField tpay;

    public static void main(String[] args) {
        try {
            Einput dialog = new Einput();
            dialog.setDefaultCloseOperation(2);
            dialog.setVisible(true);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public Einput() {
        this.setTitle("Input User Info");
        this.setBounds(100, 100, 291, 262);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        this.getContentPane().add(panel, "West");
        panel.setLayout(new GridLayout(5, 4, 0, 0));
        JLabel lblNewLabel_4 = new JLabel("NAME :");
        panel.add(lblNewLabel_4);
        lblNewLabel_4 = new JLabel("AGE :");
        panel.add(lblNewLabel_4);
        lblNewLabel_4 = new JLabel("ADDRESS :");
        panel.add(lblNewLabel_4);
        lblNewLabel_4 = new JLabel("PHONE # :");
        panel.add(lblNewLabel_4);
        lblNewLabel_4 = new JLabel("PASSWORD :");
        panel.add(lblNewLabel_4);
        panel = new JPanel();
        this.getContentPane().add(panel, "Center");
        panel.setLayout(new GridLayout(0, 1, 0, 5));
        this.tname = new JTextField();
        panel.add(this.tname);
        this.tname.setColumns(10);
        this.told = new JTextField();
        panel.add(this.told);
        this.told.setColumns(10);
        this.tadd = new JTextField();
        panel.add(this.tadd);
        this.tadd.setColumns(10);
        this.tbu = new JTextField();
        panel.add(this.tbu);
        this.tbu.setColumns(10);
        this.tpay = new JTextField();
        panel.add(this.tpay);
        this.tpay.setColumns(10);
        JButton btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = Einput.this.tname.getText().trim();
                int old = Integer.parseInt(Einput.this.told.getText().trim());
                String add = Einput.this.tadd.getText().trim();
                String bu = Einput.this.tbu.getText().trim();
                int pay = Integer.parseInt(Einput.this.tpay.getText().trim());
                VectorData.vd.add(new Emp(name, old, add, bu, pay));
                Einput.this.tname.setText("");
                Einput.this.told.setText("");
                Einput.this.tadd.setText("");
                Einput.this.tbu.setText("");
                Einput.this.tpay.setText("");
                Einput.this.tname.requestFocus();
            }
        });
        this.getContentPane().add(btnNewButton, "South");
    }
}
