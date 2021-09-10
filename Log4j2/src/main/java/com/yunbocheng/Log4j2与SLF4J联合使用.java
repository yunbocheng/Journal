package com.yunbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2与SLF4J联合使用 {
    @Test
    public void test01(){
        /*
        *   虽然log4j2也是日志门面，现在市场的主流趋势仍是SLF4J
        *   所以我们仍然需要使用SLF4J作为日志门面，搭配log4j2强大的日志实现功能，进行日志的相关操作。
        *
        *   配置 SLF4J + log4j2 （最强大的日志搭配框架）
        *   1. 在pom.xml文件中导入SLF4J的日志门面
        *   2. 导入log4j的适配器 log4j-slf4j-impl
        *   3. 导入log4j2的日志门面
        *   4. 导入log4j2的日志实现
        *
        *   这里不仅需要导入 slf4j 的日志门面技术还需要导入 log4j2的日志门面。
        *   执行原理：
        *       slf4j门面调用的是log4j2的门面，在由log4j2的门面调用log4j2的实现。
        * */

        // 此时使用的 slf4j门面技术中的类和方法来实现日志信息的输出
        Logger logger = LoggerFactory.getLogger(Log4j2与SLF4J联合使用.class);
        // slf4j 中存在5种日志输出级别，此时使用是slf4j的记录器，而不是log4j2的，所以只能输出slf4j中的五种级别。
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");

    }
}
