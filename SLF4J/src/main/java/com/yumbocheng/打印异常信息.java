package com.yumbocheng;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 打印异常信息 {

    @Test
    public void test01(){
        /*
        *   一般情况下，我们的异常信息都是记录在控制台上（这是我们开发环境的一种日志打印方式）
        *   我们会根据这个异常信息来找到错误，处理bug
        *
        *   但是在真是生产环境中（比如项目已经上线），对于服务器或者是系统相关的问题
        *   在控制台上其实也会提供响应的异常或者处理信息的输出
        *   但是这种错误输出方法（输出的时间、位置、格式...）都是服务器系统默认的。
        *
        *   我们可以通过日志技术，选择将异常以日志打印的方法，进行输出查看
        *   输出的时间、位置（控制台、文件）、格式。完全由我们自己取进行定义。
        * */
        // 编译器提供的默认的打印格式（输出到控制台）
        // System.out.println(1);

        Logger loggr = LoggerFactory.getLogger(打印异常信息.class);
        try {
            // 以下代码会打印的错误信息是 : ClassNotFoundException(找不到指定的类)
            Class.forName("aaa");
        } catch (ClassNotFoundException e) {
            // 这行代码的含义是：打印栈的追踪信息
            // 这个时候也是使用的默认打印方法(位置和格式)，打印到控制台，打印的是trace级别
            // e.printStackTrace();
            // 自定义日志信息输出级别
            loggr.info("xxx类中的xxx方法出现了异常");
            // 此时e是引用类型对象，不能根前面的{}做有效的字符串拼接
            // 如果后面是拼接的字符串，可以使用这个{}
            // loggr.info("其具体错误是：{}",e);
            // 这个info为我们添加了一个直接获取异常对象的方法
            // void info(String var1, Throwable var2);
            loggr.info("错误信息是：",e);
        }
    }
}
