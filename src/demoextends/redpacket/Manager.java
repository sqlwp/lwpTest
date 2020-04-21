package demoextends.redpacket;

import java.util.ArrayList;

/**
 * @ClassName:     群主类
 * @Description:   发红包的人
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-04
 */
public class Manager extends User {
    public Manager() {

    };

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> radlist = new ArrayList<>();
        //查询余额
        int leftMoney = super.getMoney();
        //判断余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return radlist;
        }
        //群主扣钱
        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            radlist.add(avg);
        }
        int last = avg + mod;
        radlist.add(last);

        return radlist;
    }
}
