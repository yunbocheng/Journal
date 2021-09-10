package com.yunbocheng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class 入门案例 {

    @Test
    public void test01(){
        /*
        * 这个案例中我们单纯的使用Log4j2 门面+实现
        * 不使用 SLF4J 实现。
        * Log4j2和log4j提供了相同的输出级别。
        * */
       Logger logger = LogManager.getLogger(入门案例.class);
       logger.fatal("fatal信息");
       logger.error("error信息");
       logger.warn("warn信心");
       logger.info("info信息");
       logger.debug("debug信息");
       logger.trace("trace信息");
    }
}
