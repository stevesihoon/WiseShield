//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFileChooser;

public class Load {
    Scanner scan;

    public Load() {
    }

    void load() {
        JFileChooser fs = new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Load File");
        int result = fs.showOpenDialog((Component)null);
        InputStream in = null;
        BufferedInputStream bin = null;
        ObjectInputStream oin = null;
        if (result == 0) {
            File fi = fs.getSelectedFile();

            try {
                in = new FileInputStream(fi.getPath());
                bin = new BufferedInputStream(in);
                oin = new ObjectInputStream(bin);
                Vector<Staff> readObject = (Vector)oin.readObject();
                VectorData.vd = readObject;
            } catch (Exception var16) {
                var16.printStackTrace();
            } finally {
                try {
                    oin.close();
                } catch (IOException var15) {
                    var15.printStackTrace();
                }

            }
        }

    }
}
