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

public class Eoutput extends JDialog {
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Eoutput dialog = new Eoutput();
                    dialog.setDefaultCloseOperation(2);
                    dialog.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public Eoutput() {
        this.setTitle("모든사원출력");
        this.setBounds(100, 100, 450, 300);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(22);
        this.getContentPane().add(scrollPane, "Center");
        this.table = new JTable();
        DefaultTableModel model = new DefaultTableModel(new Object[0][], new String[]{"이름", "나이", "주소", "부서", "급여"});
        this.table = new JTable(model);
        this.table.setRowHeight(30);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(330);
        DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
        celAlignCenter.setHorizontalAlignment(0);

        int i;
        for(i = 0; i < 5; ++i) {
            this.table.getColumnModel().getColumn(i).setCellRenderer(celAlignCenter);
        }

        for(i = 0; i < VectorData.vd.size(); ++i) {
            if (VectorData.vd.get(i) instanceof Emp) {
                model.addRow(((Staff)VectorData.vd.get(i)).show());
            }
        }

        scrollPane.setViewportView(this.table);
    }
}
