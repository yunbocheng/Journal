package com.yunbocheng.JUL;

import org.junit.Test;
import org.omg.CORBA.INITIALIZE;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * JUL入门案列
 */
public class 入门以及默认级别展示 {

    @Test
    public void Test01(){

        // 入门案例
        /*
        *  日志入口程序
        *  java.util.logging.Logger
        * */
        // Logger对象的创建方式，不能直接new对象
        // 取得Logger对象的方法参数，需要引入当前类的全路径字符串（我们在这里先这么使用，以后可以根据包结构有Logger父子关系，以后详细介绍）
        Logger logger = Logger.getLogger("com.yunbocheng.JUL.入门以及默认级别展示");

        /*
        * 对于日志的输出，有两种方式
        *
        * 第一种方法：
        *   直接调用日志级别相关的方法，方法中传递日志输出信息
        *   假设现在我们要输出info级别的日志信息。
        * */
        // logger.info("输出info信息1");

        /*
        *  第二种方式：
        *   通过调用的log方法，然后在里面通过Level类型来定义日志的级别参数，
        *   以及搭配日志输出信息的参数。
        * */
        // logger.log(Level.INFO,"输出info信息2");

        /*
        * 输出学生信息
        *   姓名
        *   年龄
        * */

        // String name = "zhangsan";
        // int age = 23;
        // logger.log(Level.INFO,"学生的姓名为：" + name + ",年龄为：" + age);

        /*
        * 对于输出信息中，字符串的拼接弊端很多
        *   1.麻烦
        *   2.程序效率低
        *   3.可读性不强
        *   4.维护成本高
        *
        * 我们应该使用动态生成数据的方法，生产日志
        * 使用占位符的方式进行操作。
        * */
        String name = "zhangsan";
        int age = 23;
        logger.log(Level.INFO,"学生的姓名：{0}，年龄：{1}",new Object[]{name,age});

        /**
         * 通过打印结果，我们可以看到的仅仅是输出了info级别的以及比info级别高的日志信息。
         * 这个高低的判断就取决于Level()方法中的第二个参数的大小。比info级别低的日志信息
         * 没有输出出来，证明了info级别的日志信息，它是系统默认的日志级别，在默认日志级别info的
         * 基础上，打印比他级别高的信息。
         * 此时没有设置打印输出的级别，使用的是默认级别（即info）此时打印的是比info级别高的日志信息
         * 其中包含info级别的日志信息，所以此时只会打印 severe、warning、info
         */
        logger.severe("severe信息");
        logger.warning("warining信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");

    }
}
