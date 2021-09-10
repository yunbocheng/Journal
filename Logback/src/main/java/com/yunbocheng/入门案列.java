package com.yunbocheng;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 入门案列 {

    @Test
    public void test01(){
        /*
        *   入门案例：
        *       logback有5个级别的日志输出格式
        *       trace(追踪信息) < debug(普通信息) < info(重要信息) < warn(警告信息) < error(错误信息)
        *   logback默认的打印级别是：debug
        *
        * */
        // 这里我们还是使用slf4j的门面技术来实现logback
        Logger logger = LoggerFactory.getLogger(入门案列.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");

    }
}
