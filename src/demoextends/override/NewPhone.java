package demoextends.override;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示头像和姓名");
    }
}
