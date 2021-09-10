package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 日志文件输出 {
    @Test
    public void test01(){
        /*
        * 使用 log4j2将日志信息输出到指定文件
        *
        * 1. 配置xml配置文件
        * */
        Logger logger = LoggerFactory.getLogger(日志文件输出.class);
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
    }
}
