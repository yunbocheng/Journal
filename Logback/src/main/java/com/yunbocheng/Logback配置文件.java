package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback配置文件 {
    @Test
    public void test01(){
        /*
        *  Logback配置文件的使用
        *   在resources下创建一个logback.xml文件，这个配置文件可以自动读取出来。
        * */

        // 使用slf4j门面技术来获取一个logback日志记录器
        Logger logger = LoggerFactory.getLogger(Logback配置文件.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
