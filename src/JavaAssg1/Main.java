package JavaAssg1;

import java.io.*;
import java.util.Scanner;

public class Main {

    static void printFileNamesMatchingRegex(String regex){
        File dir = new File("/home/user");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.matches(regex);
            }
        };
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i< children.length; i++) {

                String filename = children[i];
                File file = new File(filename);
                System.out.println(filename);
                System.out.println(file.getAbsolutePath());
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex;
        do{
            System.out.println("ENter a regex or enter '-1' to exit");
            regex = sc.next();
            printFileNamesMatchingRegex(regex);
        }while (!regex.equals("-1"));

    }


}