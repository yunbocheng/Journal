package com.yunbocheng;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class 日志信息输出到文件 {

    @Test
    public void test01(){
        /*
        * 将日志信息输出到指定文件中
        *   这里我们仍然使用配置文件中的打印格式
        *   以后只要使用log4j就使用配置文件方式，而不使用硬编码方式。
        *
        * 之前我们在配置文件中配置的是输出到控制台相关的配置
        * 那么我们可以直接将输出到控制台改变为输出到指定文件。
        * 一般情况下我们也可以做多方向的输出，所以控制台的配置我们保留，但是我们不用。
        *
        * */
        /*
        * 使用这个输出到指定文件中的日志信息最主要的是定位到这个指定文件的位置。
        * 日志文件要保存到哪个相关的配置
        * 查看FileAppender的源码
        *   protected boolean fileAppend; 代表是否追加信息，通过构造方法赋值为true
        *   protected int bufferSize; 缓冲区大小，通过构造方法赋值 8192
        *
        *   使用setFile()方法来指定输出日志文件的位置
        *   通过ognl，可以推断setFile方法操作的属性就是file
        *
        *   如果有输出中文的需求怎么办？
        *   观察 FileAppender 的父类
        *   找到 protected String encoding; 这个属性用来配置编码方式。
        * */
        // 使用该类的反射机制来获取到一个记录器，程序的入口
        Logger logger = Logger.getLogger(日志信息输出到文件.class);

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
        * 将日志文件输出到文件中，进行日志信息的拆分。
        *   日志太多了，不方便管理和维护怎么办
        *   FileAppender为我们提供了好用的子类来进一步的对于文件输出进行处理
        *      RollingFileAppender
        *      DailyRollingFileAppender
        *
        *   1. RollingFileAppender
        *       这个类是按照文件的大小进行拆分的操作。
        *       首先还是配置文件。
        *   如何进行拆分的，观察RollingFileAppender源码
        *       protected long maxFileSize = 10485760L; 代表拆分文件的大小
        *       protected int maxBackupIndex = 1; 代表拆分文件的数量
        *
        *   2. DailyRollingFileAppender
        *       这个类是按照时间来进行文件的拆分
        *   如何进行拆分的，观察RollingFileAppender源码
        *       注意这个前边的单引号。
        *       private String datePattern = "'.'yyyy-MM-dd"; 默认是按照天来进行拆分
        * */
        Logger logger = Logger.getLogger(日志信息输出到文件.class);

        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
