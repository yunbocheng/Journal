package com.yumbocheng;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class 日志重构 {

    @Test
    public void test01(){
        /*
        * 这个时候我们使用log4j将输出日志格式转换为 logback+slf4j
        * 此时需要使用 slf4j 提供的桥接器 log4j-over-slf4j 来实现
        * */
        Logger logger = LogManager.getLogger(日志重构.class);
        logger.info("info信息");
    }
}
