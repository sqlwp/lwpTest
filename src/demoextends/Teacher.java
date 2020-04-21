package demoextends;

/**
 * @ClassName:     Teacher
 * @Description:   教师类
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-03
 */
public class Teacher extends Employee {

    @Override
    public void method() {
        System.out.println("教师子类方法执行");
    }
}
