//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;

public class Temp extends Staff implements Serializable {
    private int pay;
    private int workhour;

    public Temp(String name, int age, String addr, String part, int pay, int workhour) {
        super(name, age, addr, part);
        this.pay = pay;
        this.workhour = workhour;
    }

    public String[] show() {
        String[] str = new String[]{this.getName(), String.valueOf(this.getAge()), this.getAddr(), this.getPart(), VectorData.comma(this.getPay()), String.valueOf(this.getWorkhour()), VectorData.comma(this.getPay() * this.getWorkhour())};
        return str;
    }

    public int getPay() {
        return this.pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getWorkhour() {
        return this.workhour;
    }

    public void setWorkhour(int workhour) {
        this.workhour = workhour;
    }
}
