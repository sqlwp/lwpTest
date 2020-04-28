package democollection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName 斗地主综合案例
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/28 16:48
 * @Version 1.0
 */
public class DouDiZhu {

    public static void main(String[] args) {
        /**
         * 1、准备牌
         * 2、洗牌
         * 3、发牌
         * 4、看牌
         */

        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String s : color) {
                poker.add(number + s);
            }
        }

        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                player1.add(p);
            } else if (i % 3 == 1) {
                player2.add(p);
            } else if (i % 3 == 2) {
                player3.add(p);
            }
        }
        //看牌
        System.out.println("刘德华：" + player1);
        System.out.println("周星驰：" + player2);
        System.out.println("郭富城：" + player3);
        System.out.println("底牌：" + dipai);
    }

}
