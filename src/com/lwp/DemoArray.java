package com.lwp;

import java.util.Random;
import java.util.Scanner;

/**
 * @author  刘卫鹏
 * @date  2020-03-30
 * @version 1.0
 */
public class DemoArray {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int[] intArray = {6, 8};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 1.2;

        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);


    }
}
