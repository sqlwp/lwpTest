package democollection;

import java.util.ArrayList;

/**
 * @ClassName 斗地主玩家类
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/28 17:41
 * @Version 1.0
 */
public class Player {

    public Player() {
    }

    public Player(String name, ArrayList<String> pokers) {
        this.name = name;
        this.pokers = pokers;
    }

    private String name;
    private ArrayList<String> pokers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<String> pokers) {
        this.pokers = pokers;
    }
}
