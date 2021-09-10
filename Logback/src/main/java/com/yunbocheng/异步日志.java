package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 异步日志 {
    @Test
    public void test01(){
        /*
        *  在实际的开发中，我们需要将日志信息与系统信息同时打印输出
        *  也就是多线程
        * */
        // 打印日志信息
        Logger logger = LoggerFactory.getLogger(异步日志.class);
        for (int i = 0; i < 1000; i++) {
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
        }

        // 打印系统信息
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
