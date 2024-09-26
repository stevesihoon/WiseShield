//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Toutput extends JDialog {
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Toutput dialog = new Toutput();
                    dialog.setDefaultCloseOperation(2);
                    dialog.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public Toutput() {
        this.setTitle("");
        this.setBounds(100, 100, 450, 300);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(22);
        this.getContentPane().add(scrollPane, "Center");
        this.table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new Object[0][], new String[]{"NAME", "AGE", "ADDRESS", "PHONE #", "--", "--", ""});
        this.table = new JTable(model);
        this.table.setRowHeight(30);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(330);
        DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
        celAlignCenter.setHorizontalAlignment(0);

        int i;
        for(i = 0; i < 7; ++i) {
            this.table.getColumnModel().getColumn(i).setCellRenderer(celAlignCenter);
        }

        for(i = 0; i < VectorData.vd.size(); ++i) {
            if (VectorData.vd.get(i) instanceof Temp) {
                model.addRow(((Staff)VectorData.vd.get(i)).show());
            }
        }

        scrollPane.setViewportView(this.table);
    }
}
