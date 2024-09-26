//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;

public class Save {
    public Save() {
    }

    public void save() {
        JFileChooser fs = new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Save File");
        int result = fs.showSaveDialog((Component)null);
        OutputStream out = null;
        BufferedOutputStream bout = null;
        ObjectOutputStream oout = null;
        if (result == 0) {
            File fi = fs.getSelectedFile();

            try {
                out = new FileOutputStream(fi.getPath() + ".dat");
                bout = new BufferedOutputStream(out);
                oout = new ObjectOutputStream(bout);
                oout.writeObject(VectorData.vd);
            } catch (Exception var16) {
                var16.printStackTrace();
            } finally {
                try {
                    oout.close();
                } catch (IOException var15) {
                    var15.printStackTrace();
                }

            }
        }

    }
}
