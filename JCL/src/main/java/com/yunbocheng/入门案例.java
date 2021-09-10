package com.yunbocheng;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class 入门案例 {

    @Test
    public void test01(){
        /*
        *  我们暂时还没有导入第三方的日志框架，例如：log4j
        *
        *  默认情况下，会使用JUL日志框架做日志的记录操作。
        *
        *  JUL使用原则：
        *      如果有log4j，优先使用log4j
        *      如果没有任何第三方日志框架的时候，我们使用的就是这个JUL
        * */
        // 注意：这里需要导入的是apache下的这个Log
        Log log = LogFactory.getLog(入门案例.class);
        log.info("info信息");
    }

    @Test
    public void test02(){
        /*
        *   导入log4j依赖，继续测试原有程序
        *
        *   总结：
        *       我们上一个案例，使用的是JUL，但是在集成了log4j环境之后，使用的又是log4j
        *       通过测试观察，虽然日志框架发生了变化，但是代码完全没有改变
        *
        *   日志门面技术：
        *       门面技术是面向接口的开发，不再依赖具体的实现类，减少代码的耦合性。
        *       可以根据实际需求，灵活的切换日志框架
        *       统一的API，方便开发者学习和使用，统一的配置管理便于项目日志的维护工作。
        *
        *   JCL门面技术使用日志框架源码分析：
        *       Log接口的4个实现类
        *       JDK13 :
        *       JDK14 : 正常java.util.logging
        *       Log4j : 我们继承的log4j
        *       Simple : JCL自带实现类
        *
        *       (1) 查看jdk14Logger源码证明里面使用的是JUL日志框架
        *       (2) 查看Log4JLogger源码证明里面使用的Log4j日志框架
        *
        *       (3) 观察LogFactory，看看如何加载Logger对象
        *           这是一个抽象类，无法实例化
        *           需要观察其实现类LogFactoryImpl
        *       (4) 观察LogFactoryImpl
        *           真正加载日志实现类的是这个实现类 LogFactoryImpl
        *
        *           LogFactoryImpl在底层遍历我们拥有的日志框架
        *           遍历的是一个数组，这个数组是按照
        *           log4j
        *           jdk14
        *           jdk13
        *           SimpleLogger
        *           的顺序依此遍历的
        *           表示的是，第一个遍历的是log4j,如果有log4j则使用log4j来执行该日志框架
        *           如果没有，则遍历出来第二个日志框架，使用jdk14的JUL日志框架
        *           依此类推。
        * */

        Log log = LogFactory.getLog(入门案例.class);
        log.info("info信息");
    }
}
