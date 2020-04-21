package demoextends.redpacket;

public class User {
    private String name;//姓名
    private int money;//钱数

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(String name,int money) {
        System.out.println("我叫：" + name + ",我有" + money + "元！");
    }
    public void show() {
        System.out.println("我叫：" + name + ",我有" + money + "元！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
