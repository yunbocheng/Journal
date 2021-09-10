package com.yumbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.*;

public class 入门案例 {

    @Test
    public void test01(){

        /*
        * 入门案例：
        *       SLF4J : 对日志划分的级别
        *
        *       trace : 日志追踪信息
        *       debug : 日志详细信息
        *       info : 日志的关键信息 (默认的打印级别)
        *       warn : 日志警告信息
        *       error : 日志错误信息
        *
        *       在没有任何其他日志实现框架的基础之上
        *       SLF4J使用的就是自带的框架slf4j-simple
        *       slf4j-simple也必须以单独依赖的形式导入进来。
        * */
        // 注意：这里使用的包是SLF4J的
        Logger logger = LoggerFactory.getLogger(入门案例.class);
        logger.trace("trace信息");
        logger.debug("debug信息");
        logger.info("info信息");
        logger.warn("warn信息");
        logger.error("error信息");

    }

    @Test
    public void test02(){
        /*
        * 我们输出动态的信息时，可以使用占位符的形式来代替字符串的拼接
        *
        *
        * */
        Logger logger = LoggerFactory.getLogger(入门案例.class);
        String name = "张三";
        int age = 10;
        // 以下是使用字符串拼接的形式打印信息，很麻烦
        // logger.info("姓名为：" + name + "，年龄为：" + age);

        // 现在使用占位符来动态输出这个信息
        // logger.info("学生信息-姓名：{}，年龄：{}",new Object[]{name,age});
        logger.info("学生信息-姓名：{}，年龄：{}",name,age);
    }
}
