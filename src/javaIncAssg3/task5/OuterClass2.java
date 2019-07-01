package javaIncAssg3.task5;

public class OuterClass2 {
    OuterClass2(){
        System.out.println("Outerclass 2");
    }
    static class InnerClass2 extends OuterClass1.InnerClass1 {
        InnerClass2(String hello){
            super(hello);
            System.out.println("Innerclass 2 says " +hello);
        }
    }
}
