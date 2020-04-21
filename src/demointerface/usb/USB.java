package demointerface.usb;

/**
 * @ClassName:    USB接口类
 * @Description:
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-08
 */
public interface USB {
    /**
     * 打开设备
     *
     * @return 没有返回值
     */
    public abstract void open();

    /**
     * 关闭设备
     *
     * @return 没有返回值
     */
    public abstract void close();
}
