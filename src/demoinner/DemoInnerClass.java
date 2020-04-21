package demoinner;

/**
 * @ClassName DemoInnerClass
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 15:42
 * @Version 1.0
 */
public class DemoInnerClass {
    public static void main(String[] args) {
        //通过外部类间接调用
        Body body=new Body();
        body.method();
        //直接调用
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}
