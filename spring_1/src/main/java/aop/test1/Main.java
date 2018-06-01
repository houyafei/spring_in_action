package main.java.aop.test1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/main/resource/aop_test1/spring-config2.xml");
        Fight fight = (Fight) applicationContext.getBean("fight");
        fight.onFighting(" dragon");
    }
}
