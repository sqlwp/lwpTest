package demoextends.demoabstrac;

/**
 * @ClassName:     动物-猫的实现类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class Cat extends AbstractAnimal {

    @Override
    public void eat(String eatWhat) {
        System.out.println("猫吃："+eatWhat);
    }
}
