package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class 自定义logger {
    @Test
    public void test01(){
        Logger logger = LoggerFactory.getLogger(日志输出为html文件.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
