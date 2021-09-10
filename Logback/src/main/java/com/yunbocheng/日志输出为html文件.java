package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 日志输出为html文件 {
    @Test
    public void test01(){
        /*
        * 将日志输出成为一个html文件
        *
        * 这个html文件是由logback来帮我们控制样式和格式
        * 内容由我们自己来定义。
        * */
        Logger logger = LoggerFactory.getLogger(日志输出为html文件.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
