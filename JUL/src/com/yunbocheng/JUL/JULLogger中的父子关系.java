package com.yunbocheng.JUL;


import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JULLogger中的父子关系 {

    @Test
    public void test01(){

        /*
        *  Logger之间的父子关系
        *   JUL中Logger之间是存在“父子”关系的
        *   但是需要注意的是 ：这种父子关系不是我们普遍认为的类之间的继承关系。
        *   这里的父子关系是通过树状机构存储的。
        * */

        /*
        *  JUL中的父子之间的关系是通过这种包结构来进行实现的。
        *  从下面的两个logger对象来看
        *  我们可以认为logger1是logger2的父类。（越具体的越是子类）
        * */

        /*
        * JUL在初始化的时候会常创建一个顶层的RootLogger作为所有的Logger的父Logger
        * 查看源码：
        *   owner.rootLogger = owner.RootLogger();
        *   RootLogger是LogManager的内部类
        *   这个RootLogger对象给定的输出级别是 info
        *   所以在没有继承自定的父类的时候，默认继承的就是这个RootLogger父类，
        *   并且这个父类的输出级别是info，所以子类继承这个父类的输出级别，
        *   子类的输出默认就是info。
        * */

        // 创建一个父类
        Logger logger1  = Logger.getLogger("com.yunbocheng.JUL");
        // 日志对象的子类
        Logger logger2 = Logger.getLogger("com.yunbocheng.JUL.JULLogger中的父子关系");

        // 这里使用 getParent()方法来判断
        System.out.println(logger2.getParent() == logger1);  // true
        /*
        * 只要是整体结构比他短的都是它的 父结构
        * */

        // 这个logger1没有在代码中声明具体的父类，所以此时他的父类是顶级父类 RootLogger。
        // 名称默认是一个空字符串 null
        // RootLogger可以被称之为所有的logger对象的顶层logger
        System.out.println("logger1的父logger引用为：" + logger1.getParent() + "，名称为：" +logger2.getName() +
                "; 父亲的名称为：" + logger1.getParent().getName());

        // 这个logger2在代码中有声明具体的父类logger对象。所以此时输出的父类是logger1，名称是 com.yunbocheng.JUL
        System.out.println("logger2的父logger引用为：" + logger2.getParent() + "，名称为：" +logger2.getName() +
                "; 父亲的名称为：" + logger2.getParent().getName());

        /*
        *  父亲所作的设置，也能够同时作用于儿子
        *  对logger1做日志的打印，然后我们使用logger2进行日志的打印。
        * */

        // 父类做打印的设置
        logger1.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger1.addHandler(handler);
        logger1.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        // 儿子做打印的内容
        logger2.severe("server信息");
        logger2.warning("warning信息");
        logger2.info("info信息");
        logger2.config("config信息");
        logger2.fine("fine信息");
        logger2.finer("finer信息");
        logger2.finest("finest信息");
    }
}
