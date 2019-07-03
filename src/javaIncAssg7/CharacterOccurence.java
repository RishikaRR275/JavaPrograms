//package javaIncAssg7;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
    private static HashMap<Character,Integer> map = new HashMap<>();

    private static void findCharOccurences(FileInputStream fr) throws IOException{
        int ch;
        while ((ch=fr.read())!=-1) {
            System.out.print((char) ch);
            char alphabet = (char)ch;
            if(!map.containsKey(alphabet))
                map.put(alphabet,1);
            else{
                int frequency = map.get(alphabet);
                frequency++;
                map.put(alphabet,frequency);
            }
        }
    }

    private static String outputText(){
        String text = "";
        for (Map.Entry mapElement : map.entrySet())
        {
            char key = (Character)mapElement.getKey();
            int value = (int)mapElement.getValue() ;
            text += key+" - "+value +"\n";

        }
        return text;
    }

    public static void main(String[] args) throws IOException{
        FileInputStream inputStream=null;
        FileWriter fileWriter = null;
        try
        {
            //System.out.println(args[0]);
            inputStream = new FileInputStream("inputText.txt");
            findCharOccurences(inputStream);

            fileWriter = new FileWriter("outputText.txt");
            String text = outputText();
            fileWriter.write(text);
        }
        finally
        {
            if(inputStream !=null)
                inputStream.close();
            if(fileWriter !=null)
                fileWriter.close();
        }
    }
}


