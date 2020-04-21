package demoextends.redpacket;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName:     抢红包的群成员类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }


    public void receive(ArrayList<Integer> list) {
        //随机取一个红包
        int index = new Random().nextInt(list.size());
        //移除已经领取的红包,并返回移除的红包
        int del = list.remove(index);
        //查询自己的余额，并加上红包金额
        int money = super.getMoney();
        super.setMoney(money + del);
    }
}
