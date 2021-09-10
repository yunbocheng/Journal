package com.yunbocheng;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class father {
    private String name = print();

    private String print() {
        System.out.println(2);
        return null;
    }

    private int age = create();

    private int create() {
        return 0;
    }

    private static boolean sex = true;

    static {
        System.out.println(sex);
        System.out.println("1");
    }

    public father() {
        System.out.println(5);
    }

    public father(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
