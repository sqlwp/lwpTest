package democollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName DemoIterator
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/28 14:01
 * @Version 1.0
 */
public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("集合数组测试");
        Iterator<String> it=coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
