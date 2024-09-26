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

public class Tinput extends JDialog {
    private JTextField tname;
    private JTextField told;
    private JTextField tbu;
    private JTextField tadd;
    private JTextField ttpay;
    private JTextField twork;

    public static void main(String[] args) {
        try {
            Tinput dialog = new Tinput();
            dialog.setDefaultCloseOperation(2);
            dialog.setVisible(true);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public Tinput() {
        this.setTitle("Input Emergency Contacts");
        this.setBounds(100, 100, 291, 262);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        this.getContentPane().add(panel, "West");
        panel.setLayout(new GridLayout(6, 4, 0, 0));
        JLabel lblNewLabel_5 = new JLabel("NAME :");
        panel.add(lblNewLabel_5);
        lblNewLabel_5 = new JLabel("AGE :");
        panel.add(lblNewLabel_5);
        lblNewLabel_5 = new JLabel("ADDRESS :");
        panel.add(lblNewLabel_5);
        lblNewLabel_5 = new JLabel("PHONE # :");
        panel.add(lblNewLabel_5);
        lblNewLabel_5 = new JLabel("---- :");
        panel.add(lblNewLabel_5);
        lblNewLabel_5 = new JLabel("---- :");
        panel.add(lblNewLabel_5);
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
        this.ttpay = new JTextField();
        panel.add(this.ttpay);
        this.ttpay.setColumns(10);
        this.twork = new JTextField();
        panel.add(this.twork);
        this.twork.setColumns(10);
        JButton btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = Tinput.this.tname.getText().trim();
                int old = Integer.parseInt(Tinput.this.told.getText().trim());
                String add = Tinput.this.tadd.getText().trim();
                String bu = Tinput.this.tbu.getText().trim();
                int tpay = Integer.parseInt(Tinput.this.ttpay.getText().trim());
                int work = Integer.parseInt(Tinput.this.twork.getText().trim());
                VectorData.vd.add(new Temp(name, old, add, bu, tpay, work));
                Tinput.this.tname.setText("");
                Tinput.this.told.setText("");
                Tinput.this.tadd.setText("");
                Tinput.this.tbu.setText("");
                Tinput.this.ttpay.setText("");
                Tinput.this.twork.setText("");
                Tinput.this.tname.requestFocus();
            }
        });
        this.getContentPane().add(btnNewButton, "South");
    }
}
