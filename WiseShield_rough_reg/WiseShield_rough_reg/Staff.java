//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;

public class Staff implements Serializable {
    protected String name;
    protected int age;
    protected String addr;
    protected String part;

    public Staff(String name, int age, String addr, String part) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.part = part;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPart() {
        return this.part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String[] show() {
        String[] str = new String[]{this.getName(), String.valueOf(this.getAge()), this.getAddr(), this.getPart()};
        return str;
    }
}
