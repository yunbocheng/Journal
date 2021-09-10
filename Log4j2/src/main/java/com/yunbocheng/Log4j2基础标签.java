package com.yunbocheng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2基础标签 {
    @Test
    public void test01(){
        /*
        * 使用配置文件
        *     log4j是参考logback创作出来的，而不是参考log4j创作出来的
        *     log4j的配置文件也是xml文件
        *     log4j同样是默认加载类路径（resources）下的log4j2.xml文件中的配置。
        *     注意：此时的配置文件叫做 log4j2.xml
        *
        *     根标签，所以日志相关信息，都是在跟标签中配置的
        *     <Configuration status="debug" monitorInterval="数值"></Configuration>
        *     在很标签中，可以加入属性
        *     status="debug" 日志框架本身的日志输出级别
        *     monitorInterval="5" 自动加载配置文件的间隔时间，不低于5秒
        *     这两个属性名不可以修改。
        * */
        Logger logger = LogManager.getLogger(Log4j2基础标签.class);
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信心");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
