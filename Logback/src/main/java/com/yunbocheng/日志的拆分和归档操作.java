package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 日志的拆分和归档操作 {
    @Test
    public void test01(){
        /*
        * 日志文档的拆分及归档压缩
        *
        * */
        Logger logger = LoggerFactory.getLogger(日志的拆分和归档操作.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
