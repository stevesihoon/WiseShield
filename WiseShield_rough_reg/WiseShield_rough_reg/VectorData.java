//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.text.DecimalFormat;
import java.util.Vector;

public class VectorData {
    public static Vector<Staff> vd = new Vector(10, 5);

    public VectorData() {
    }

    public static String comma(int num) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format((long)num);
    }
}
