package com.yumbocheng;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class sfl4j_nop禁止日志打印 {

    @Test
    public void test01(){
        /*
        *  使用log4j-nop
        *       表示不记录日志
        *       在我们使用slf4j-nop的时候
        *       首先还是需要向pom.xml文件中导入实现类依赖
        *       这个实现依赖，根据simple与logback属于同一级别。
        *       所以如果想让这个nop发挥效果，禁止所有日志的打印
        *       那么就必须将这个slf4j-nop的依赖放在所有日志依赖的上方
        * */

        Logger logger = LoggerFactory.getLogger(sfl4j_nop禁止日志打印.class);

        try {
            // 以下代码会打印的错误信息是 : ClassNotFoundException(找不到指定的类)
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            logger.info("xxx类中的xxx方法出现了异常");
            logger.info("错误信息是：", e);
        }
    }
}
