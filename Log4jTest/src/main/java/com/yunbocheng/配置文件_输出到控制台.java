package com.yunbocheng;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.jupiter.api.Test;


public class 配置文件_输出到控制台 {

    /*
    *  配置文件的使用
    *
    *   1. 观察源码 BasicConfigurator.configure();
    *       可以得到两条信息：
    *          （1）创建了根节点的对象， Logger root = Logger.getRootLogger();
    *          （2）根节点添加了ConsoleAppender对象（表示默认打印到控制台，自定义的格式输出）
    *   2. 我们这一次，不使用这个默认的处理器 BasicConfigurator.configure();
    *       自定义的配置文件来实现功能
    *       通过我们对于以上第一点的分析，我们的配置文件需要提供Logger、Appender、Layout
    *       这3个组件的信息（通过配置来代替以上的代码）
    *   3. 分析：
    *      Logger logger = Logger.getLogger(配置文件.class);
    *      进入getManager.getLogger(class.getName());
    *      LogManager ：日志管理器
    *
    *       点击LogManage，看看这个日志管理器中都实现了什么
    *       可以发现里边有很多的常量信息，他们代表的就是不同形式（后缀名不同）的配置文件
    *       我们最常见的就是log4j.properties属性文件（语法简单，使用方便）
    *
    *   4. log4j.properties属性文件的加载时机
    *       继续观察LogManager，找到其中的静态代码块static
    *       在static静态代码块中，我们可以找到
    *       Loader.getResource("log4j.properties");
    *       这行代码给我们的最大的一个提示信息就是
    *       系统默认要从当前的类路径下找到log4j.properties
    *       对于我们当前的项目是Maven工程，那么这个根路径是 resources 下
    *
    * */
    @Test
    public void test01(){
        Logger logger = Logger.getLogger(配置文件_输出到控制台.class);
        // 打印输出信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test02(){
        /*
        * 日志输出详细信息的开关
        * */

        // 打开输出详细日志信息
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(配置文件_输出到控制台.class);
        // 打印输出信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test03(){
        /*
         * 关于log4j.properties layout属性的配置
         * 这个配置的是日志输出的格式
         * 这个输出格式 也是在Log4j的配置文件中修改。
         *  最长使用的是自定义的输出格式  即 PatternLayout
         *
         * 这个时候需要修改log4j.properties文件中的日志信息输出格式。
         * 需要在默认输出的配置文件下加入一行自定义格式的输出日志格式信息。
         * */
        Logger logger = Logger.getLogger(配置文件_输出到控制台.class);
        // 添加打印信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
