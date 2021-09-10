package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 将日志信息打印到指定文件 {

    @Test
    public void test01(){
        /*
        *   将日志信息打印到文件中
        *   只需要修改 main-->resources下的logback.xml文件配置即可
        *
        *
        *   还可以同时在多个位置打印日志信息(控制台、文件)
        *   打印到文件中默认是以追加的方法打印的
        * */
        Logger logger = LoggerFactory.getLogger(将日志信息打印到指定文件.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
