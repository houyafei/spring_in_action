# 切面编程-通过注解标签的方式进行：
## 1：配置spring-config2.xml文件
### 在使用时，该文件的路径是基于src目录下的全路径如：
```
 ApplicationContext applicationContext = 
 new ClassPathXmlApplicationContext("/main/resource/aop_test/spring-config.xml");
```
下面是具体的配置中的关键部分,

```
    //扫描所有包含注解的包
    <context:component-scan base-package="main.java.aop.test1"/>
    //开启aop代理功能
    <aop:aspectj-autoproxy proxy-target-class="true"/>
```
其中aop对应的命名空间为：
```
       xmlns:aop="http://www.springframework.org/schema/aop"
```



## 2. 关于配置：导入如下的jar包：
```
https://mvnrepository.com/artifact/org.aspectj/aspectjweaver
       'org.aspectj:aspectjweaver:jar:1.8.13'
```
否则会出现无法创建bean的错误和找不到相关类的错误。

## 3. 关于注解

```java
/**
* @Component 用于spring的组件扫描的注释
* @Aspect 表明这是一个切面
*/
@Component 
@Aspect
public class Minstrel {

    Minstrel() {
    }

    //这里表明方法执行前的操作
    @Before("execution(* main.java.aop.test1.Fight.onFighting(..))")
    public void beforeRun() {
        System.out.println("come on, baby");
    }

    //这里表明方法执行后的操作
    @After("execution(* main.java.aop.test1.Fight.onFighting(..))")
    public void afterRun() {
        System.out.println("have a rest, thank you");
    }

}

```
