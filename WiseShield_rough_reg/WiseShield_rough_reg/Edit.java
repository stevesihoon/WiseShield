//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Edit extends JDialog {
    private JTextField tname;
    private JTextField tage;
    private JTextField tadd;
    private JTextField tbu;
    private JTextField tpay;
    private JTextField tworkhour;
    private JTextField txtSearch;
    int pos = 0;

    public static void main(String[] args) {
        try {
            Edit dialog = new Edit();
            dialog.setDefaultCloseOperation(2);
            dialog.setVisible(true);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public Edit() {
        this.setTitle("Edit / Delete");
        this.setBounds(100, 100, 343, 289);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        this.getContentPane().add(panel, "Center");
        panel.setLayout(new GridLayout(6, 3, 0, 10));
        this.tname = new JTextField();
        panel.add(this.tname);
        this.tname.setColumns(10);
        this.tage = new JTextField();
        panel.add(this.tage);
        this.tage.setColumns(10);
        this.tadd = new JTextField();
        panel.add(this.tadd);
        this.tadd.setColumns(10);
        this.tbu = new JTextField();
        panel.add(this.tbu);
        this.tbu.setColumns(10);
        this.tpay = new JTextField();
        panel.add(this.tpay);
        this.tpay.setColumns(10);
        this.tworkhour = new JTextField();
        panel.add(this.tworkhour);
        this.tworkhour.setColumns(10);
        panel = new JPanel();
        this.getContentPane().add(panel, "West");
        panel.setLayout(new GridLayout(6, 4, 0, 10));
        JLabel label = new JLabel("NAME");
        panel.add(label);
        label = new JLabel("AGE");
        panel.add(label);
        label = new JLabel("ADDRESS");
        panel.add(label);
        label = new JLabel("---");
        panel.add(label);
        label = new JLabel("---");
        panel.add(label);
        label = new JLabel("---");
        panel.add(label);
        panel = new JPanel();
        this.getContentPane().add(panel, "South");
        JButton btnNewButton_1 = new JButton("Search");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < VectorData.vd.size(); ++i) {
                    if (((Staff)VectorData.vd.get(i)).getName().equals(Edit.this.txtSearch.getText())) {
                        Edit.this.tname.setText(((Staff)VectorData.vd.get(i)).getName());
                        Edit.this.tage.setText(String.valueOf(((Staff)VectorData.vd.get(i)).getAge()));
                        Edit.this.tadd.setText(((Staff)VectorData.vd.get(i)).getAddr());
                        Edit.this.tbu.setText(((Staff)VectorData.vd.get(i)).getPart());
                        Edit.this.pos = i;
                        return;
                    }
                }

                JOptionPane.showMessageDialog((Component)null, "There's no data.");
                Edit.this.txtSearch.setText("");
                Edit.this.txtSearch.requestFocus();
            }
        });
        panel.add(btnNewButton_1);
        btnNewButton_1 = new JButton("edit");
        panel.add(btnNewButton_1);
        btnNewButton_1 = new JButton("delete");
        panel.add(btnNewButton_1);
        panel = new JPanel();
        this.getContentPane().add(panel, "North");
        panel.setLayout(new FlowLayout(1, 5, 5));
        label = new JLabel("Search Name :");
        panel.add(label);
        this.txtSearch = new JTextField();
        panel.add(this.txtSearch);
        this.txtSearch.setColumns(10);
        label = new JLabel("");
        panel.add(label);
    }
}
