package com.yunbocheng;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class 日志持久化_将数据存储到数据库 {

    @Test
    public void test01(){
        /*
        * 日志持久化，将日志持久化数据库表中
        *   第一步 ：传创建表结构（字段的指定可以根据需求进行调整）
        *   CREATE TABLE tal_log(
        *       id int(11) NOT NULL AUTO_INCREMENT,
        *       name varchar(255) DEFAULT NULL COMMENT '项目名称',
        *       createTime varchar(255) DEFAULT NULL COMMENT '创建时间',
        *       ...
        *       PRIMARY KEY(id)
        *   )
        * */
        // 获取记录器对象，就是打印日志信息的入口
        Logger logger = Logger.getLogger(日志持久化_将数据存储到数据库.class);
        // 输出日志信息
        logger.fatal("fatal信息");
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");

    }
}
