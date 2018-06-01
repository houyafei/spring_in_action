package main.java.aop.test1;

import org.springframework.context.annotation.Bean;

public class Fight {

    private Knight knight;


    public Fight(Knight knight) {
        this.knight = knight;
    }

//    public void onFighting() {
//        System.out.println("now, on fighting");
//        knight.sayHello();
//    }

    public void onFighting(String army) {
        System.out.println("now, fighting " + army);
        knight.sayHello();
    }




}
