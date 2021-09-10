package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncLogger方式实现全局刷新 {

    @Test
    public void test01(){
        /*
        *   实现全局异步
        *   全局异步：
        *       所有的日志都是异步的日志记录，在配置文件上不用做任何的改动
        *       只需要在类路径 resources 下添加一个properties属性文件，做一步配置即可。
        *       文件名要求是：log4j2.component.properties
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
