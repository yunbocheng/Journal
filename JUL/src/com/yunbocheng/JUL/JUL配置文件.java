package com.yunbocheng.JUL;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JUL配置文件 {

    @Test
    public void text01() throws Exception {
        /*
         * 以上所有的配置相关的操作，都是一Java硬编码的形式进行的。
         * 我们可以使用更加清晰，更加专业的一种做法，就是配置文件。
         * 如果我们没有自己添加这个配置文件，则会使用系统默认的配置文件。
         *
         * 这个配置文件：
         *  java.home --> 找到jre文件夹 --> lib --> logging.properties
         *
         *  配置文件中的＃代表的注释，可以删除掉。
         *
         * */
        /*
        *  我们从外部来读取这个配置文件之后就不需要我们在写 释放默认级别、设置输出级别、定义格式等代码。
        *  我们只需要创建一个处理器对象，使用这个处理器对象来读取我们的配置文件信息。
        *  之后我们直接打印想要输出的信息即可。
        *
        * */
        // 获取日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        // 获取一个输入流对象，这个对象用来读取我们自定义的配置文件的信息
        // 这个参数就是 自定义的配置文件的路径信息。
        // 如果我们不是自定义的配置文件，那么此时就会使用默认的配置文件，自动进行寻找，
        // 不用我们在创建输入流对象。
        InputStream inputStream = new FileInputStream("D:\\test\\logging.properties");
        // 使用这个日志管理器对象来读取自定义的配置文件
        logManager.readConfiguration(inputStream);

        // 获取一个日志记录器对象，这个是日志程序的入口
        Logger logger = Logger.getLogger("com.yunbocheng.JUL.JUL配置文件");

        logger.severe("server信息");
        logger.warning("warning信息");
        logger.info("info信息");
        logger.config("config信息");
        logger.fine("fine信息");
        logger.finer("finer信息");
        logger.finest("finest信息");
    }
}
