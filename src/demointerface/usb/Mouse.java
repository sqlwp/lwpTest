package demointerface.usb;

/**
 * @ClassName 鼠标类
 * @Description TODO
 * @Author 刘卫鹏
 * @Date 2020/4/8 11:32
 * @Version 1.0
 */
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
