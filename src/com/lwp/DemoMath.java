package com.lwp;

import java.util.ArrayList;

/**
 * @ClassName:     DemoMath
 * @Description:   练习使用
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-01
 */
public class DemoMath {
    public static void main(String[] args) {
        double d = 99.48;
        //绝对值
        System.out.println(Math.abs(d));
        //向上取整
        System.out.println(Math.ceil(d));
        //向下取整
        System.out.println(Math.floor(d));
        //四舍五入
        System.out.println(Math.round(d));
        //π
        System.out.println(Math.PI);
        //-10.8到5.9，绝对值大于6或者小于2.1的整数有多少个？
        int wd = (int) -10.8;
        double end = 5.9;
        ArrayList<Integer> reint = new ArrayList();
        while (true) {
            wd++;
            //System.out.println(Math.abs(wd));
            if (wd < end) {
                if (Math.abs(wd) > 6 || Math.abs(wd) < 2.1) {
                    System.out.println(Math.floor(wd));
                    reint.add((int) Math.floor(wd));
                }
            } else {
                break;
            }
        }
        //上面的方法总是少一个，2.8大于2.1，一直少个2
        System.out.println("一共有" + reint.size() + "个整数");

        //优化后方法
        int coutn = 0;
        double min = -10.8;
        double max = 2.1;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(abs);
                coutn++;
            }
        }
        System.out.println("一共有" + coutn + "个整数");
    }
}
