package demointerface;

/**
 * @author 刘卫鹏
 * @version V1.0
 * @ClassName: MyInterfaceAbs实现类类
 * @Description:
 * @Date 2020-04-06
 */
public class MyInterfaceAbsImpl2 implements MyInterfaceAbs {

    @Override
    public void methodAbs() {
        System.out.println("我继承了接口，并实现了methodAbs方法BBB");
    }

    @Override
    public void methodAbs2() {
        System.out.println("默认方法可以不重写，一旦重写，就以重写的为准");
    };
}
