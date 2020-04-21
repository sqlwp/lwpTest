package demoextends.override;

/**
 * @ClassName:     手机基类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class Phone {
    public void send(){
        System.out.println("发送短信");
    }
    public void call(){
        System.out.println("打电话");
    }
    public void show(){
        System.out.println("来电显示");
    }
}
