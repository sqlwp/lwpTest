package com.lwp;


/**
 * @ClassName:     DemoStatic
 * @Description:   使用
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-01
 */
public class DemoStatic {

    int num;
    static int numstatic;
    public static void main(String[] args) {
        System.out.println("我是带有静态成员方法的类");
        //new一个带有静态代码块的类，就会执行静态代码块
        Student stu=new Student();
    }

    public static void staticmethod() {

        //静态方法可以通过类名称.方法名调用
        System.out.println("我是一个静态方法，属于类！");
        //报错,静态不能调用非静态，先有静态，后有非静态。前人不知道后人
        //System.out.println(num);


    }
}
