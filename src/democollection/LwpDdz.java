package democollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @ClassName LwpDdz
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/28 17:27
 * @Version 1.0
 */
public class LwpDdz {
    public static void main(String[] args) {
        //创建牌
        ArrayList<String> poker = new ArrayList<>();
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        poker.add("大王");
        poker.add("小王");
        for (String s : color) {
            for (String n : numbers) {
                poker.add(s + n);
            }
        }
        //创建玩家
        ArrayList<Player> players = new ArrayList<>();
        Player lwp = new Player("刘卫鹏", new ArrayList<String>());
        Player ldh = new Player("刘德华", new ArrayList<String>());
        Player gfc = new Player("郭富城", new ArrayList<String>());
        players.add(lwp);
        players.add(ldh);
        players.add(gfc);
        ArrayList<String> dipai = new ArrayList<>();
        //洗牌
        Collections.shuffle(poker);
        System.out.println(players.size());
        //给玩家发牌
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                players.get(0).getPokers().add(poker.get(i));
            } else if (i % 3 == 1) {
                players.get(1).getPokers().add(poker.get(i));
            } else if (i % 3 == 2) {
                players.get(2).getPokers().add(poker.get(i));
            }
        }
        //抢地主
        Random r = new Random();
        int num = r.nextInt(players.size());
        Player s = players.get(num);
        System.out.println(s.getName() + "是地主！");
        //把底牌给地主
        Iterator<String> dpit=dipai.iterator();
        while (dpit.hasNext()){
            s.getPokers().add(dpit.next());
        }
        //看牌
        Iterator<Player> users = players.iterator();
        while (users.hasNext()) {
            Player currentPlayer = users.next();
            System.out.println(currentPlayer.getName() + "的牌：" + currentPlayer.getPokers());
        }
        System.out.println("底牌："+dipai);
    }
}
