package demoextends.redpacket;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName:     MainRedPacket
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member member1 = new Member("成员1", 0);
        Member member2 = new Member("成员2", 0);
        Member member3 = new Member("成员3", 0);
        System.out.println("======================");
        //群主发红包
        ArrayList<Integer> list = manager.send(100, 3);
        //成员收红包
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        //展示所有人的余额
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }

}
