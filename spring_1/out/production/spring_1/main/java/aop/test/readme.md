# 切面编程：
## 1：配置spring-config.xml文件
### 在使用时，该文件的路径是基于src目录下的全路径如：
```
 ApplicationContext applicationContext = 
 new ClassPathXmlApplicationContext("/main/resource/aop_test/spring-config.xml");
```
下面是具体的配置中的关键部分,

```
    <aop:config>
        <aop:pointcut id = "say" expression="execution(* main.java.aop.test.Fight.onFighting(..))"/>
        <aop:aspect ref="minstrel">
            <aop:before pointcut-ref="say" method="beforeRun"/>
            <aop:after  pointcut-ref="say" method="afterRun"/>
        </aop:aspect>
    </aop:config>
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