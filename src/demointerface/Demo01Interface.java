package demointerface;


/**
 * @ClassName:     我的抽象接口类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-06
 */
public class Demo01Interface {
    public static void main(String[] args) {
        /*接口是多个类的引用类型*/
        MyInterfaceAbsImpl impl = new MyInterfaceAbsImpl();
        impl.methodAbs();
        impl.methodAbs2();

        MyInterfaceAbsImpl2 impl2 = new MyInterfaceAbsImpl2();
        impl2.methodAbs();
        impl2.methodAbs2();

        //静态接口类的静态方法，直接用接口点方法名直接调用
        MyInterfaceAbs.methodstatic();

        MyInterfaceAbs obj=new MyInterfaceAbs() {
            @Override
            public void methodAbs() {
                System.out.println("匿名内部类实现了接口方法");
            }
        };
        obj.methodAbs();
        obj.methodAbs();
    }
}
