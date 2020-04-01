package com.lwp;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author  刘卫鹏
 * @date  2020-03-31
 * @version 1.0
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("刘德华");
        list.add("吴宗宪");
        list.add("王力宏");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println("删除前数量：" + list.size());
        String removeWho = list.remove(0);
        System.out.println(removeWho + "--被删除了！");
        System.out.println("删除后数量：" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //错误写法，泛型只能是引用类型
        //ArrayList<int> ints=new ArrayList<int>();
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1688);
        ints.add(8888);
        System.out.println("第一号是：" + ints.get(0));

        //生成6个1-33的随机数，并添加到ArrayList，并遍历输出
        Random r = new Random();
        ArrayList<Integer> intlist = new ArrayList<>();
        int rintnum = 6;
        for (int i = 0; i < rintnum; i++) {
            intlist.add(r.nextInt(33) + 1);
        }
        getSamllList(intlist);
        for (int i = 0; i < intlist.size(); i++) {
            System.out.println("遍历："+intlist.get(i));
        }

        ArrayList<Student> students = new ArrayList<>();
        Student one = new Student("刘德华", 56);
        Student two = new Student("lwp", 18);
        students.add(one);
        students.add(two);
        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            System.out.println("姓名：" + stu.getName() + " 年龄：" + stu.getAge());
        }
    }

    public static ArrayList<Integer> getSamllList(ArrayList<Integer> list) {
        ArrayList<Integer> returnArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int currenInt = list.get(i);
            if (currenInt % 2 == 0) {
                returnArrayList.add(currenInt);
                System.out.println("发现偶数：" + currenInt);
            }
        }
        return returnArrayList;
    }

}
