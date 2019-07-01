package javaIncAssg3.task5;

public class OuterClass1 {
    OuterClass1(){
        System.out.println("Outer class 1");
    }
    static class InnerClass1{
        InnerClass1(String hello) {
            System.out.println("Inner Class 1 says " + hello);
        }
    }




}
