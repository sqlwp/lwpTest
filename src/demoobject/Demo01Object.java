package demoobject;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName Demo01Object
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 22:19
 * @Version 1.0
 */
public class Demo01Object {
    public static void main(String[] args) {
        Person person = new Person("张三", 18);
        System.out.println(person.toString());
        Random random=new Random();
        System.out.println(random);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(8);
        arrayList.add(6);
        System.out.println(arrayList);
        //如果打印出来是一个地址值，说明该对象重写了toString方法

        Person p1=new Person("刘德华",49);
        Person p2=new Person("刘德华",49);
        boolean b= p1.equals(p2);
        //引用类型比较的地址值，所以返回false
        System.out.println(b);
        //重写Person里的equals方法后，改为比较属性值，就返回了true
    }
}
