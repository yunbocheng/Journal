package com.yunbocheng.JUL;

import org.junit.Test;

public class 追加日志信息 {

    @Test
    public void test(){
        /*
        *  做文件日志打印，新日志会覆盖掉原来的日志
         * 但是我们在实际开发中想要的追加新的日志。
        *
        *  重点 ：如果想追加信息，此时只需要在日志配置文件中加入
        *  java.util.logging.FileHandler.append = true
        *  此时代表追加。
        * */
    }
}
