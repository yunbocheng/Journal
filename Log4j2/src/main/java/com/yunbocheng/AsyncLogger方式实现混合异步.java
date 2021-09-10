package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncLogger方式实现混合异步 {
    @Test
    public void test01(){
        /*
        *
        * */
        Logger logger = LoggerFactory.getLogger(AsyncLogger方式实现全局刷新.class);
        // slf4j 中存在5种日志输出级别，此时使用是slf4j的记录器，而不是log4j2的，所以只能输出slf4j中的五种级别。
        for (int i = 0; i < 100; i++) {
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
        }

        // 系统业务逻辑
        for (int i = 0; i < 100; i++) {
            System.out.println("-----------");
        }
    }
}
