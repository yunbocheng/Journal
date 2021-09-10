package com.yunbocheng.JUL;

import org.junit.Test;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.*;

public class 自定义日志级别 {

    @Test
    public void test02(){
        /*
        *  自定义日志级别，也就是改变默认级别info
        * */

        // 日志记录器(日志的入口)
        Logger logger = Logger.getLogger("com.yunbocheng.JUL.自定义日志级别");

        // 将默认的日志打印方式关闭
        //  参数设置为false，我们打印日志的方式就不会按照父logger默认的方式进行操作。
        logger.setUseParentHandlers(false);

        // 处理器Handler
        // 在此使用控制台日志处理器，取得处理器对象
        // 这个是将日志信息输出到控制台
        ConsoleHandler handler = new ConsoleHandler();
        // 创建日志格式化组件对象，这个格式是可以任意修改的，这里先使用默认的格式。
        SimpleFormatter formatt = new SimpleFormatter();
        // 在处理器中设置输出格式
        handler.setFormatter(formatt);
        // 在记录器中添加处理器
        logger.addHandler(handler);

        // 设置日志的打印级别
        // 此处必须将日志记录器和处理器的级别进行统一设置，才会达到日志显示相应级别的效果
        logger.setLevel(Level.CONFIG);
        handler.setLevel(Level.CONFIG);

        logger.severe("severe信息");
        logger.warning("warining信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");

        /*
        * 此时已经将默认的日志级别改变为config级别，此时打印的是config以及config以上的信息。
        * */
    }
    @Test
    public  void test03() throws IOException {
        /*
        *  将日志输出到具体的磁盘文件中
        *  这样就相当于是做了日志的持久化操作。
        * */

        // 获取日志记录器对象，这个是日志的入口
        Logger logger = Logger.getLogger("com.yunbocheng.JUL.自定义日志级别");
        // 关闭默认的日志级别
        logger.setUseParentHandlers(false);

        // 文件日志处理器，配置打印日志的地方 注意这个日志文件的后缀名必须是 .log
        FileHandler handler = new FileHandler("E:\\JavaProject\\journal\\Log_information\\myLogTest.log");
        // 使用日志格式化组件
        SimpleFormatter formatter = new SimpleFormatter();
        // 在处理器中设置输出信息格式
        handler.setFormatter(formatter);
        // 在记录器中添加处理器
        logger.addHandler(handler);

        // 更改输出的级别
        logger.setLevel(Level.ALL);
        handler.setLevel(Level.ALL);

        // 输出信息
        logger.severe("severe信息");
        logger.warning("warining信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");

    }

    @Test
    public  void test04() throws IOException {

        /*
        *  同时添加多个处理器
        *  也就是同时控制台和自定义的位置输出日志信息
        *
        * */

        // 创建一个日志记录器（日志的入口）
        Logger logger = Logger.getLogger("com.yunbocheng.JUL.自定义日志级别");
        // 释放默认的打印日志信息级别
        logger.setUseParentHandlers(false);
        // 创建一个从控制台输出的处理器
        ConsoleHandler handler = new ConsoleHandler();
        // 创建一个从指定位置输出日志信息的文件
        FileHandler handler1 = new FileHandler("E:\\JavaProject\\journal\\Log_information\\myLog.log");
        // 使用日志格式化组件，这个格式是可以任意修改的，这里我们使用的是默认的格式
        SimpleFormatter formatter = new SimpleFormatter();
        // 在处理器中设置输出格式
        handler.setFormatter(formatter);
        handler1.setFormatter(formatter);

        // 在记录器中添加处理器
        logger.addHandler(handler);
        logger.addHandler(handler1);

        // 设置打印日志的级别，要将记录器与处理器
        logger.setLevel(Level.ALL);
        handler.setLevel(Level.CONFIG);
        handler1.setLevel(Level.ALL);

        // 在控制台和指定位置进行日志信息的输出
        logger.severe("severe信息");
        logger.warning("warining信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");
    }
}
