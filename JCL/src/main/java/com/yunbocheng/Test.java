package com.yunbocheng;

public class Test extends father {

    private String name = print();
    private int age = create();

    private static boolean sex = false;

    static {
        System.out.println(sex);
        System.out.println("p12");
    }
    public Test() {
        System.out.println("p15");
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print(){
        System.out.println("p13");
        return null;
    }
    public int create(){
        System.out.println("p12");
        return 0;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test = new Test();
    }
}
