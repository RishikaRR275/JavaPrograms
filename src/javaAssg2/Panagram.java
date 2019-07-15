/* Write a java function that checks if the input string contains all
the letters of the alphabet a-z (case-insensitive).
*/
package javaAssg2;

import java.util.Scanner;

public class Panagram {
    static String isInputPanagram(String sentence){
        if(sentence.length()<26)
            return "Not a Panagram";
        boolean isPanagram = true;
        sentence = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0 ;i<alphabet.length();i++){
            if(!sentence.contains(""+alphabet.charAt(i))){
                isPanagram = false;
            }
        }
        if(isPanagram)
            return "Panagram!";
        return  "Not a Panagram";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it's a panagram");
        String inputString = sc.nextLine();
        System.out.println(isInputPanagram(inputString));
    }
}
