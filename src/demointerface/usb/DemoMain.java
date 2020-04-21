package demointerface.usb;

/**
 * @ClassName DemoMain
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 11:52
 * @Version 1.0
 */
public class DemoMain {
    public static void main(String[] args) {
        //创建一个电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标,供一个电脑使用
        USB usb = new Mouse();
        computer.useUsb(usb);

        //创建要给键盘
        Keyboard keyboard = new Keyboard();
        computer.useUsb(keyboard);

        //关机
        computer.powerOff();
    }
}
