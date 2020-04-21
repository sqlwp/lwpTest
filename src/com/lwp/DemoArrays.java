package com.lwp;


import java.util.Arrays;

/**
 * @ClassName:     DemoArrays
 * @Description:   练习使用
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-01
 */
public class DemoArrays {
    public static void main(String[] args) {
        int[] array={1,2,10,3};
        String arraystr= Arrays.toString(array);
        System.out.println(arraystr);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String rstr="hbjs";
        char[] chardhs=rstr.toCharArray();
        for (int i = 0; i < chardhs.length; i++) {
            System.out.println(chardhs[i]);
        }

        System.out.println("===========");

        //倒叙排列
        for (int i = chardhs.length - 1; i >= 0; i--) {
            System.out.println(chardhs[i]);
        }
    }
}
