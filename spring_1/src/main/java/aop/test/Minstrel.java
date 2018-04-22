package main.java.aop.test;


import org.aspectj.lang.ProceedingJoinPoint;

public class Minstrel {



    Minstrel() {
    }

    public void beforeRun() {
        System.out.println("come on, baby");
    }

    public void afterRun() {
        System.out.println("have a rest, thank you");
    }

    public void aroundRun(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("-----begin around--");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("-----end around---");
    }

//    若使用该不含参数的方法，切点位置的方法（目标方法不执行）
    public void aroundRun2(){
        System.out.println("-----begin around--");

        System.out.println("-----end around---");
    }

    public void beforeRunArgs(String army){
        System.out.println("in in ==== "+army);
    }

}
