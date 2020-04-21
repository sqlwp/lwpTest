package demointerface;

/**
 * @ClassName:     我的抽象接口类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-06
 */
public interface MyInterfaceAbs {

    /*public static final int num=10;*/

    //常量
    int NUM=10;

    /**
     * 接口的无参数抽象方法
     *
     * @return 没有返回值
     */
    void methodAbs();

    /**
     * 接口的静态方法
     *
     * @return 没有返回值
     */
    static void methodstatic() {
        System.out.println("静态接口的静态类");
    }

    /**
     * 接口的默认方法方法(为了解决接口升级的问题)
     *
     * @return 没有返回值
     */
    default void methodAbs2() {
        System.out.println("这是新添加的默认方法");
        System.out.println("AAA");
    }

    /**
     * 接口的默认方法方法(为了解决接口升级的问题)
     *
     * @return 没有返回值
     */
    default void methodAbs3() {
        System.out.println("这是新添加的默认方法");
        System.out.println("AAA");
        //commonfun();
    }

    /*private void commonfun(){
        //java9新增的特性
        System.out.println();
    }*/

}
