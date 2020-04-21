package demoextends.override;

/**
 * @ClassName:     子类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class Zi extends Fu{
    public Zi(){
        super(10);
        System.out.println("子类构造方法");
    }

    public void method(){
        //报错:只有子类的构造方法才能调用父类的构造方法，super只能有一个，还必须是第一个
        //super(10);
    }
}
