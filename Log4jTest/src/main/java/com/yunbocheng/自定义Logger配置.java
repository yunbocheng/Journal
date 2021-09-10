package com.yunbocheng;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.jupiter.api.Test;

public class 自定义Logger配置 {

    @Test
    public void test01(){
        /*
        * Log4j自定义的logger
        *   我们以前所创建出来的logger对象，默认都是继承rootLogger的
        *   我们也可以自定义logger，让其他logger来继承这个logger。
        *
        *   这种继承关系就是按照包结构的关系来进行指定的。
        *   例如：我们一直使用默认的Logger是继承其rootLogger
        *   Logger logger = Logger.getLogger(日志持久化_将数据存储到数据库.class);
        *   这时候获取logger对象的路径是
        *   com.yunbocheng.自定义Logger配置
        *   它的父logger就是上层的路径或者是更上层的路径
        *   例如：
        *       com.yunbocheng
        *       com
        * 参照logger是如何加载配置文件的
        * 查看PropertyConfigurator的源码
        *   static final String LOGGER_PREFIX = "log4j.logger.";
        *   以上这个属性 log4j.logger. 就是我们在配置文件中对于自定义logger的配置属性
        * */
      /*
        # 配置根节点logger
        log4j.rootLogger = trace,console

        # 配置自定义logger
        log4j.logger.com.yunbocheng = info,file

        观察结果：
            从输出的位置来看，控制台输出了信息，日志文件也会输出信息。
            所以可以得出结论，如果根节点的logger和自定义父logger配置的输出位置是不同的
            则取二者的并集，也就是配置的位置都会进行日志的输出。

            如果二者配置的日志级别不同，主要以按照我们自定义的父logger的级别输出为主。


        */
        Logger logger = Logger.getLogger(日志持久化_将数据存储到数据库.class);
        // 输出日志信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    @Test
    public void test02(){
        /*
        * 自定义logger的应用场景
        *   我们之所以要自定义logger，就是为了针对不同的操作系统信息做更加灵活的输出操作。
        *   例如：
        *       我们可以在原有案例的基础之上，加一个apache的日志输出。
        * */
    }
}
