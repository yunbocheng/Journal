# Java日志框架

<center>
<img src="https://gitee.com/YunboCheng/imageBad/raw/master/image/%E8%AF%AD%E8%A8%80.jpg" >
</center>


<br>

<div align="center">
    <img src="https://img.shields.io/badge/log4j-Apache-mediumslateblue">    
    <img src="https://img.shields.io/badge/JUL-JDK提供-mediumslateblue">    
    <img src="https://img.shields.io/badge/SLF4J-门面技术-mediumslateblue">
    <img src="https://img.shields.io/badge/Logback-信息-mediumslateblue">
    <img src="https://img.shields.io/badge/log4j2-日志框架-mediumslateblue">
<br>

</div>

## 一、Java日志框架家族

![](https://gitee.com/YunboCheng/imageBad/raw/master/image/%E6%97%A5%E5%BF%97.jpg)

## 二、Java日志依赖

![](https://gitee.com/YunboCheng/imageBad/raw/master/image/%E6%97%A5%E5%BF%97%E6%A1%86%E6%9E%B6.png)

## 三、清单

### 1. Java日志框架简介

- [日志框架简介](./日志介绍.md)

### 2. Log4j

- [入门案例以及日志级别](Log4jTest/src/main/java/com/yunbocheng/入门案例以及日志级别.java)
- [配置文件-输出到控制台](Log4jTest/src/main/java/com/yunbocheng/配置文件_输出到控制台.java)
- [日志信息输出到文件](Log4jTest/src/main/java/com/yunbocheng/日志信息输出到文件.java)
- [日志持久化(数据存储到数据库)](Log4jTest/src/main/java/com/yunbocheng/日志持久化_将数据存储到数据库.java)
- [自定义Logger配置](Log4jTest/src/main/java/com/yunbocheng/自定义Logger配置.java)
- [Log4j配置文件(log4j.properties)](Log4jTest/src/main/resources/log4j.properties)
- [pom.xml](Log4jTest/pom.xml)

### 3. JUL

-	[入门案例以及默认级别](./JUL/src/com/yunbocheng/JUL/入门以及默认级别展示.java)
-	[JUL配置文件](./JUL/src/com/yunbocheng/JUL/JUL配置文件.java)
-	[自定义日志级别](./JUL/src/com/yunbocheng/JUL/追加日志信息.java)
-	[JUL-Logger中的父子关系](./JUL/src/com/yunbocheng/JUL/JULLogger中的父子关系.java)
-	[追加日志信息](./JUL/src/com/yunbocheng/JUL/追加日志信息.java)

### 4. JCL

- [入门案例](JCL/src/main/java/com/yunbocheng/入门案例.java)
- [配置文件(log4j.properties)](JCL/src/main/resources/log4j.properties)
- [pom.xml](JCL/pom.xml)

### 5.SLF4J

- [入门案例](SLF4J/src/main/java/com/yumbocheng/入门案例.java)
- [打印异常信息](SLF4J/src/main/java/com/yumbocheng/打印异常信息.java)
- [sfl4j_nop禁止日志打印](SLF4J/src/main/java/com/yumbocheng/sfl4j_nop禁止日志打印.java)
- [SFL4J日志集成的分类](SLF4J/src/main/java/com/yumbocheng/SFL4J日志集成的分类.java)
- [SLF4J集成log4j的方法](SLF4J/src/main/java/com/yumbocheng/SLF4J集成log4j的方法.java)
- [SLF4J集成JUL](SLF4J/src/main/java/com/yumbocheng/SLF4J集成JUL.java)
- [日志重构](SLF4J/src/main/java/com/yumbocheng/日志重构.java)
- [配置文件(log4j.properties)](SLF4J/src/main/resources/log4j.properties)
- [pom.xml](SLF4J/pom.xml)

### 6.Logback

- [入门案例](Logback/src/main/java/com/yunbocheng/入门案列.java)
- [Logback配置文件](Logback/src/main/java/com/yunbocheng/Logback配置文件.java)
- [将日志信息打印到指定文件](Logback/src/main/java/com/yunbocheng/将日志信息打印到指定文件.java)
- [日志输出为html文件](Logback/src/main/java/com/yunbocheng/日志输出为html文件.java)
- [日志的拆分和归档操作](Logback/src/main/java/com/yunbocheng/日志的拆分和归档操作.java)
- [使用过滤器更细粒度的打印日志](Logback/src/main/java/com/yunbocheng/使用过滤器更细粒度的打印日志.java)
- [异步日志](Logback/src/main/java/com/yunbocheng/异步日志.java)
- [配置文件(logback.xml)](Logback/src/main/resources/logback.xml)
- [pom.xml](Logback/pom.xml)

### 7.Log4j2

- [入门案例](Log4j2/src/main/java/com/yunbocheng/入门案例.java)
- [Log4j2基础标签](Log4j2/src/main/java/com/yunbocheng/Log4j2基础标签.java)
- [Log4j2与SLF4J联合使用](Log4j2/src/main/java/com/yunbocheng/Log4j2与SLF4J联合使用.java)
- [日志文件输出](Log4j2/src/main/java/com/yunbocheng/日志文件输出.java)
- [log4j2日志拆分](Log4j2/src/main/java/com/yunbocheng/log4j2日志拆分.java)
- [异步实现使用AsyncAppender](Log4j2/src/main/java/com/yunbocheng/异步实现使用AsyncAppender.java)
- [AsyncLogger方式实现全局刷新](Log4j2/src/main/java/com/yunbocheng/AsyncLogger方式实现全局刷新.java)
- [AsyncLogger方式实现混合异步](Log4j2/src/main/java/com/yunbocheng/AsyncLogger方式实现混合异步.java)
- [配置文件(logback.xml)](Log4j2/src/main/resources/log4j2.xml)
- [全局异步配置文件(log4j2.component.properties)](Log4j2/src/main/resources/log4j2.component.properties)
- [pom.xml](Log4j2/pom.xml)


## 四、参考文献

在线文档 :

> - [SLF4J官方文档](http://www.slf4j.org/)
> - [Maven中央仓库](https://mvnrepository.com/)


## 五、反馈及改进

如果您在学习的时候遇到了任何问题，或者清单有任何可以改进的地方，

非常欢迎提出issues,看到就会回馈.并且将您添加到项目贡献者列表中。

## 六、参与贡献

1. Fork 本仓库
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request，填写必要信息。
5. 等待审核即可。通过之后会邮件通知您。

## 七、许可证

在 MIT 许可下分发。有关更多信息，请参阅[`LICENSE`](./LICENSE)。

## 八、致谢

>  1. 感谢动力节点提供的Java日志在线课程视频资料 [Java日志在线课程](https://www.bilibili.com/video/BV1Mb4y1Z74W)
>  2. 感谢JetBrains提供的配套开发环境许可证 [官方网站](https://www.jetbrains.com/)
>  3. 感谢Gitee提供的图床平台 [相关地址](https://gitee.com/YunboCheng/imageBad)

