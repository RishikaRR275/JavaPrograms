package javaIncAssg3.task5;

public class OuterClass {
    OuterClass(){
        System.out.println("Outer class");
    }
    static class InnerClass1{
        InnerClass1(String hello) {
            System.out.println("Inner Class 1 says " + hello);
        }
    }

    static class InnerClass2 extends InnerClass1{
        InnerClass2(String hello){
            super(hello);
            System.out.println("Innerclass 2 says " +hello);
        }
    }

    public static void main(String[] args){
        new OuterClass();
        new InnerClass1("hello");
        new InnerClass2("hey!");
    }
}
