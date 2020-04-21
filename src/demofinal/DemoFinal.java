package demofinal;



/**
 * @ClassName Final练习类
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 14:30
 * @Version 1.0
 */
public class DemoFinal {
    //final表示最终的不可改变的
    //可以用来修饰类、方法、局部变量、成员变量
    public static void main(String[] args) {
        final int num1=10;
        //num1=20; //错误写法，不能改变final修饰的变量
        Student student=new Student("关晓彤");
        System.out.println(student.getName());
        student=new Student("古力娜扎");
        System.out.println(student.getName());
        final Student student1=new Student("高圆圆");
        //student1=new Student("刘德华");错误写法，final改变
    }
}
