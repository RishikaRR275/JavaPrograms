package rishika.incrementalAssg.main;

import rishika.incrementalAssg.data.DataClass;
import rishika.incrementalAssg.singleton.Singleton;

public class Main {
    public static void main(String[] args){
        DataClass data = new DataClass();
        data.printInstanceVariables();  // prints 0 and null
        //data.printLocalVariables();

       /* Singleton singleton = Singleton.assignValueToString("chocolate"); */
        /*Cant be done because assignValueToSTring is a static method
          and is trying to refer to a non-static variable.
          Thus, the instance of Singleton it's supposed to return cant happen
         */

        //singleton.printString();
        /*
        Instance of Singleton is not created
         */
    }
}
