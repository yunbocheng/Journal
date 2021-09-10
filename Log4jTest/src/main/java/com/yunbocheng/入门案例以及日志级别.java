package com.yunbocheng;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;



public class 入门案例以及日志级别 {

    @Test
    public void test01(){

        /*
        *  Log4j入门案例
        * */

        // 记载初始化配置，也就是配置一个处理器
        /*
        * 这里可以点击这个configure()方法，可以看到这个方法中获取到一个父类的对象
        * 因为这里没有给定指定的父类，所以默认的继承的是最高父类
        * Logger root = Logger.getRootLogger();
        *
        * 并且调用这个方法会创建一个处理器，并且会创建的这个处理器的级别是打印到控制台
        * 还给定一个处理器的打印格式
        * root.addAppender(new ConsoleAppender(new PatternLayout("%r [%t] %p %c %x - %m%n")));
        *
        * */
        BasicConfigurator.configure();
        // 创建一个日志的入口，也就是记录器，注意此时需要导入的包是apache的包
        // 此时需要使用反射机制来获取这个对象
        Logger logger = Logger.getLogger(入门案例以及日志级别.class);

        // 打印输出信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
