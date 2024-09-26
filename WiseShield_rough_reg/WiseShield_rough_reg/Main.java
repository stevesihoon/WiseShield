//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public Main() {
        this.setTitle("User Registration");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu FileMenu = new JMenu("File");
        menuBar.add(FileMenu);
        JMenuItem FileSaveMenuItem = new JMenuItem("Save Data");
        FileSaveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Save save = new Save();
                save.save();
            }
        });
        FileMenu.add(FileSaveMenuItem);
        JMenuItem FileLoadMenuItem = new JMenuItem("Load Data");
        FileLoadMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Load load = new Load();
                load.load();
            }
        });
        FileMenu.add(FileLoadMenuItem);
        JMenuItem EditMenuItem = new JMenuItem("Edit");
        EditMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        FileMenu.add(EditMenuItem);
        JMenuItem DeleteMenuItem = new JMenuItem("Delete");
        FileMenu.add(DeleteMenuItem);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        JPanel panel = new JPanel();
        this.contentPane.add(panel, "Center");
        panel.setLayout(new GridLayout(5, 4, 0, 5));
        JButton btnNewButton = new JButton("Register [User]");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Einput dialog = new Einput();
                dialog.setDefaultCloseOperation(2);
                dialog.setVisible(true);
            }
        });
        panel.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Register [Emergency Contacts]");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tinput dialog = new Tinput();
                dialog.setDefaultCloseOperation(2);
                dialog.setVisible(true);
            }
        });
        panel.add(btnNewButton_1);
        JButton btnNewButton_2 = new JButton("Display User Info & Contacts");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (VectorData.vd.isEmpty()) {
                    JOptionPane.showMessageDialog((Component)null, "There's no data");
                } else {
                    Aoutput dialog = new Aoutput();
                    dialog.setDefaultCloseOperation(2);
                    dialog.setVisible(true);
                }

            }
        });
        panel.add(btnNewButton_2);
        JButton btnNewButton_3 = new JButton("Display User info");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (VectorData.vd.isEmpty()) {
                    JOptionPane.showMessageDialog((Component)null, "There's no data");
                } else {
                    Eoutput dialog = new Eoutput();
                    dialog.setDefaultCloseOperation(2);
                    dialog.setVisible(true);
                }

            }
        });
        panel.add(btnNewButton_3);
        JButton btnNewButton_4 = new JButton("Display Contacts");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (VectorData.vd.isEmpty()) {
                    JOptionPane.showMessageDialog((Component)null, "There's no data");
                } else {
                    Toutput dialog = new Toutput();
                    dialog.setDefaultCloseOperation(2);
                    dialog.setVisible(true);
                }

            }
        });
        panel.add(btnNewButton_4);
    }
}
