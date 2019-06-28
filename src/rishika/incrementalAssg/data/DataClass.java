package rishika.incrementalAssg.data;

public class DataClass {
    private int number;
    private char character;

    public void printInstanceVariables(){
        System.out.println("The instance variables.. number =" +number);
        System.out.println("character = "+character);
    }

   /* public void printLocalVariables(){
        int variable1;
        char variable2;
        System.out.println("The local variable are "+variable1+" and " +variable2);
    }
    */

  // The above method, printLocalVariables, doesn't work as local variables should always be initialized
  // before being accessed
}
