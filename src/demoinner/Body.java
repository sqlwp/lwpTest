package demoinner;

/**
 * @ClassName Body
 * @Description TODO
 * @Author sq_lw
 * @Date 2020/4/8 15:44
 * @Version 1.0
 */
public class Body {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method() {
        System.out.println("外部类方法！");
        new Heart().beat();
    }

    public class Heart {
        //成员内部心脏类
        public void beat(){
            System.out.println("心脏跳动砰砰砰");
            System.out.println(name);
        }
    }
}
