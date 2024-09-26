//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;

public class Emp extends Staff implements Serializable {
    private int pay;

    public Emp(String name, int age, String addr, String part, int pay) {
        super(name, age, addr, part);
        this.pay = pay;
    }

    public String[] show() {
        String[] str = new String[]{this.getName(), String.valueOf(this.getAge()), this.getAddr(), this.getPart(), VectorData.comma(this.getPay())};
        return str;
    }

    public int getPay() {
        return this.pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
