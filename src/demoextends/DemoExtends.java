package demoextends;

/**
 * @ClassName:     DemoExtends
 * @Description:   练习使用
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-03
 */
public class DemoExtends {
    public static void main(String[] args) {
        //继承就是为了共性抽取
        Teacher t = new Teacher();
        t.method();
        Assistent a=new Assistent();
        a.method();
    }
}
