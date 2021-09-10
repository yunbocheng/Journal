package com.yumbocheng;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SFL4J日志集成的分类 {

    @Test
    public void test01(){
        /*
        * 测试一：pom.xml中存在slf4j与logback
        * pom.xml文件种存在多个日志框架，测试使用框架的顺序
        * 如果在pom.xml文件种存在多个日志框架，默认使用先导入的日志框架实现(也就是谁在最上边就先打印谁)
        * 不论谁在上下，只要存在多个日志框架，那么都会报错
        * （ Class path contains multiple SLF4J bindings ）
        *
        * 测试二：pom.xml文件中删除slf4j文件，只留下logback框架。
        *   留下logback框架，此时打印的日志信息是黑色的，这个是logback的风格，
        *   此时不会在出现报错信息。
        *
        * 通过测试，我们发现修改了底层的日志框架，但是源代码完全没有改变。
        *
        * */

        Logger loggr = LoggerFactory.getLogger(打印异常信息.class);
        try {
            // 以下代码会打印的错误信息是 : ClassNotFoundException(找不到指定的类)
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            loggr.info("xxx类中的xxx方法出现了异常");
            loggr.info("错误信息是：", e);
        }
    }
}
