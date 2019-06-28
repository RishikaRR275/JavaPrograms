package rishika.incrementalAssg.singleton;

public class Singleton {
    private String string;

  /*  public static Singleton assignValueToString(String value){
        string = value;
        return new Singleton();
    } */

    // The above method wont work because
    // non-static variable string cannot be referenced from a static context


    public void printString(){
        System.out.println("The value of string is "+string);
    }
}
