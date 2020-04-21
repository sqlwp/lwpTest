package demoextends.demoabstrac;

/**
 * @ClassName:     抽象-练习类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class DemoMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat("鱼");
        Zi zi = new Zi();
        zi.eat();
    }
}
