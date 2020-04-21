package demoextends.demoabstrac;

/**
 * @ClassName:     动物抽象基类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public abstract class AbstractAnimal {
    /**
     * 抽象方法：吃
     * @param eatWhat 吃什么
     * @return 无返回值
     */
    public abstract void eat(String eatWhat);
    public void method(){
        System.out.println("抽象类的非抽象成员方法");
    };
}
