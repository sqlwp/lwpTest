package democollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName DemoCollection
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/27 16:10
 * @Version 1.0
 */
public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> strCollection = new ArrayList<>();
        strCollection.add("lwp");
        strCollection.add("NB!");
        System.out.println(strCollection.size());
        //strCollection.remove("lwp");
        System.out.println(strCollection);
        //strCollection.clear();
        System.out.println(strCollection);
        boolean b = strCollection.contains("lwp");
        System.out.println(b);
        Object[] array=strCollection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
