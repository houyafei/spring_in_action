package main.java.aop.test;

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
