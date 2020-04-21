package com.lwp;

/**
 * @author  刘卫鹏
 * @date  2020-03-31
 * @version 1.0
 * @desc 学生类
 */
public class Student {
    private String name;
    private int age;

    static {
        //静态代码块，只执行一次。用于一次性的对静态变量赋值
        System.out.println("静态代码块");
    }

    static {
        //静态代码块，只执行一次。用于一次性的对静态变量赋值
        System.out.println("静态代码块2");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
