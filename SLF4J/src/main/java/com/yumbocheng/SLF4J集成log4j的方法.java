package com.yumbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SLF4J集成log4j的方法 {

    @Test
    public void test01(){
        /*
        * 绑定log4j
        * 由于log4j是在slf4j之前出品的日志框架实现
        * 所以并没有遵循slf4j的API规范。
        *
        * 此时我们需要绑定一个适配器 slf4j-log4j12
        * 此时运行会发现：
        *   log4j:WARN No appenders could be found for logger
        * 这就说明我们此时使用的日志框架是log4j
        * 此时我们就可以按照log4j的日志框架那样的操作
        * 导入配置文件。
        *
        * 重点：这个时候我们可以看到上边导入的包文件，全部都是 slf4j 中的类或者接口
        *      完全没有使用到这个 log4j 包，这些工作都是通过在pom.xml文件中添加依赖的完成的。
        *      此时就非常完美的使用门面技术来实现了这个log4j代码，而且此时不需要修改源代码
        *      只需要在pom.xml文件中添加实现logback的依赖即可实现logback日志框架，打印出logback日志信息。
        *
        * 我们虽然顶层使用的是log4j做的打印，但是从当前代码使用来看
        * 我们其实使用的仍然是slf4j日志门面，至于日志是log4打印的（或者是logback打印的）
        * 都是由slf4j进行操作的，我们不关心。
        * */
        Logger logger = LoggerFactory.getLogger(SLF4J集成log4j的方法.class);
        // 打印输出信息
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
