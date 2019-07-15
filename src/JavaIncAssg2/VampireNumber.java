package JavaIncAssg2;

public class VampireNumber {

    static int getFactor1(String temp, int i, int j){
        String factor1 = ""+ temp.charAt(i) +temp.charAt(j);
        System.out.print(factor1 +" ");
        return Integer.parseInt(factor1);
    }

    static int getFactor2(String temp, int i,int j){
        char[] tempArray = temp.toCharArray();
        for(int iter = 0;iter<tempArray.length;iter++) {
            if (iter == i || iter == j)
                tempArray[iter] = '$';
        }
        String factor2 = new String(tempArray);
        factor2 = factor2.replace("$","");
        System.out.println(factor2);
        return Integer.parseInt(factor2);

    }

    static boolean isVampireNumber(String number){
        String temp = number;
        for(int i=0 ;i<number.length()-1;i++){
            for(int j=i+1;j<number.length();j++){
                temp= number;
                int factor1 = getFactor1(temp,i,j);
                int factor2 = getFactor2(temp,i,j);
                int product = factor1 * factor2;
                if(Integer.toString(product).equals(temp))
                    return true;
            }
        }
        return false;
    }

    static void printVampireNumbers(){
        int count = 0;
        for(int i=1260; count <=100;i++){
            if(isVampireNumber(Integer.toString(i))){
                System.out.print(i +" ");
                count++;
            }
        }
    }

    public static void main(String[] args){
        System.out.println("The first 100 vampire Numbers are : ");
        printVampireNumbers();

    }
}
