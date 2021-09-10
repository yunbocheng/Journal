package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 使用过滤器更细粒度的打印日志 {
    @Test
    public void test01(){
      /*
      * 使用过滤器更细粒度的打印日志信息
      * */
        Logger logger = LoggerFactory.getLogger(使用过滤器更细粒度的打印日志.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
