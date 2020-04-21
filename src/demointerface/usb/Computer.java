package demointerface.usb;

import java.security.Key;

/**
 * @ClassName:     我的抽象接口类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-06
 */
public class Computer {
    public void powerOn() {
        System.out.println("笔记本电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本电脑关机");
    }

    public void useUsb(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
        //System.out.println("我使用了USB");
    }
}
