package javaIncAssg6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        SList<Integer> sList = new SList<>();
//        System.out.println("What would you like to do?");
//        System.out.println("Insert or Delete");
//        String operation = sc.next();
        sList.iterator(5,"insert");
        sList.iterator(6,"insert");
        sList.iterator(7,"insert");
        sList.iterator(8,"insert");
        System.out.println(sList.toString());

        sList.iterator(8,"delete");
        System.out.println(sList.toString());
    }
}
