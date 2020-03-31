package com.lwp;

import java.util.Random;
import java.util.Scanner;

/**
 * @author  刘卫鹏
 * @date  2020-03-31
 * @version 1.0
 */
public class DemoScanner {
    public static void main(String[] args) {
        //猜数字小游戏
        Random r = new Random();
        int getInt = r.nextInt(100) + 1;
        System.out.println("随机数为：" + getInt);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜测的数字？");
            int userInt = scanner.nextInt();
            if (userInt < getInt) {
                System.out.println("小了");
            } else if (userInt > getInt) {
                System.out.println("大了");
            } else {
                System.out.println("恭喜您猜对了！");
                break;
            }
        }
    }
}
