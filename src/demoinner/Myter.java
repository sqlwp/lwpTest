package demoinner;

/**
 * @ClassName Myter
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 16:01
 * @Version 1.0
 */
public class Myter {
    public void methodMyter() {
        int num = 10;
        //num=20;必须是有效的final
        //因为MyClass比num的生命周期久，所以MyClass复制走一份num,所以必须保证不能改变，使用final修饰

        /**
         * @ClassName 局部内部类
         * @Description TODO
         * @Author sq_lw
         * @Date 2020/4/8 16:01
         * @Version 1.0
         */
        class MyClass {

            public void myClassmethod(){
                System.out.println(num);
            }
        }
    }
}
