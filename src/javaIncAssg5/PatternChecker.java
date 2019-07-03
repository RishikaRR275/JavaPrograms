package javaIncAssg5;

import java.util.Scanner;
import java.util.regex.*;

public class PatternChecker {
    static void checkGrammar(String sentence){
        Pattern pattern = Pattern.compile("^[A-Z].*[.!?]$");
        Matcher match = pattern.matcher(sentence);
        boolean b = match.matches();
        System.out.println(b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        checkGrammar(sentence);
    }
}
