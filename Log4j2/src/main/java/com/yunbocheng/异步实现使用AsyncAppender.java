package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 异步实现使用AsyncAppender {
    @Test
    public void test01(){
        /*
        * 异步日志使用AsyncAppender的方式
        *
        * 1. 添加异步日志依赖
        * 2. 在 log4j.xml配置文件的 Appenders标签中，对于异步进行配置
        *    使用Async标签
        * 3. rootlogger引用Async
         * */

        //日志的记录
        Logger logger = LoggerFactory.getLogger(异步实现使用AsyncAppender.class);
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
