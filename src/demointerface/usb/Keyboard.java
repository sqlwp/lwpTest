package demointerface.usb;

/**
 * @ClassName 键盘类
 * @Description TODO
 * @Author 刘卫鹏
 * @Date 2020/4/8 11:32
 * @Version 1.0
 */
public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
