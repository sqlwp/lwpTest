package com.lwp;

/**
 * @ClassName:     字符串类
 * @Description:   练习使用
 * @author         刘卫鹏
 * @version        V1.0
 * @Date           2020-04-01
 */
public class DemoString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        if (str1.equals(str2)) {
            System.out.println("两字符相同！");
        } else {
            System.out.println("两字符不相同！");
        }

        if (str1.equalsIgnoreCase(str3)) {
            System.out.println("不区分大小写的情况下，两字符相同！");
        }
        //拼接字符串
        String str4 = str1.concat(str2);
        System.out.println(str4);

        //查找指定字符串首次出现的位置
        int indexof = str4.indexOf("llo");
        System.out.println("llo首次出现的索引为：" + indexof);

        String str5 = "Hello Java";
        System.out.println(str5.substring(2));
        System.out.println(str5.substring(2, 8));
        System.out.println(str5.replace("Java", "lwp"));
        String str6 = "Hello,Java,lwp";
        String[] strArray = str6.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        //注意事项，以英文"."切割是，参数必须加上\\，例如"\\."
        String str7 = "aaa.bbb.ccc";
        String[] strArray2 = str7.split("\\.");
        for (int i = 0; i < strArray2.length; i++) {
            System.out.println(strArray2[i]);
        }

        int[] intArray = {1, 2, 8, 4, 5};
        String resultStr = "[";
        for (int i = 0; i < intArray.length; i++) {
            if (i != intArray.length - 1) {
                resultStr += "world" + intArray[i] + "#";
            } else {
                resultStr += "world" + intArray[i] + "]";
            }
        }
        System.out.println(resultStr);
    }
}
