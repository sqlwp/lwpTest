package demoniured;

/**
 * @ClassName Bootstrap
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 17:22
 * @Version 1.0
 */
public class Bootstrap {
    public static void main(String[] args) {
        //要求，群主发红包，所有人都有红包，最后一个红包留给群主
        //1、发普通红包
        //2、发随机红包
        MyRed myRed=new MyRed("牛逼的红包");
        myRed.setOwnerName("王思聪");
    }
}
