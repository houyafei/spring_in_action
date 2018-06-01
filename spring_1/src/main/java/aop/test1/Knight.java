package main.java.aop.test1;

public class Knight {

    private String name ;

    public Knight() {
    }

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello , I am a brave knight. My name is " +name);
    }
}
