package javaIncAssg4;

public class Password {

    static void checkPasswordValidity(String paswrd) throws NumberNotFoundException, CapitalLetterNotFoundException,
            SplCharNotFoundException
    {
        boolean isNumberPresent = false;
        boolean isCapitalLtrPresent = false;
        boolean isSplCharPresent = false;

        for(int i=0 ; i< paswrd.length();i++){
            if(Character.isUpperCase(paswrd.charAt(i)))
                isCapitalLtrPresent = true;
            if(Character.isDigit(paswrd.charAt(i)))
                isNumberPresent = true;
            if(!Character.isAlphabetic(paswrd.charAt(i)))
                isSplCharPresent = true;
        }

        if(!isNumberPresent)
            throw new NumberNotFoundException();

        if(!isCapitalLtrPresent)
            throw  new CapitalLetterNotFoundException();

        if(!isSplCharPresent)
            throw new SplCharNotFoundException();
    }

    public static void main(String[] args){
        try{
            checkPasswordValidity("pizza");
        }
        catch (Exception e){
            System.out.println("Invalid Password! Please make sure that there is ");
            System.out.println("atleast one capital letter, number and a special character!");
        }

        finally {
            System.out.println("Finally block executed!");
        }
    }
}
