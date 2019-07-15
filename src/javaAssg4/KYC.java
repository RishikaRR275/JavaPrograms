package javaAssg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KYC {


    static String rangeOfDates(Date signUpDate, Date currentDate){
        Calendar currentCalendar = new GregorianCalendar();
        currentCalendar.setTime(currentDate);
        int currentYear = currentCalendar.get(Calendar.YEAR);

        Calendar signUpCalendar = new GregorianCalendar();
        signUpCalendar.setTime(signUpDate);
        int signUpYear = signUpCalendar.get(Calendar.YEAR);
        int signUpDay = signUpCalendar.get(Calendar.DATE);
        int signUpMonth = signUpCalendar.get(Calendar.MONTH);

        if(signUpYear == currentYear){
            return "No Range";
        }

        Calendar signUpAnniversary = Calendar.getInstance();
        signUpAnniversary.set(Calendar.DATE,signUpDay);
        signUpAnniversary.set(Calendar.MONTH,signUpMonth);
        signUpAnniversary.set(Calendar.YEAR,currentYear);

        signUpAnniversary.add(signUpAnniversary.DATE, -30);
        Date rangeBeginning = signUpAnniversary.getTime();
        System.out.println(rangeBeginning);

        signUpAnniversary.add(signUpAnniversary.DATE, 60);
        Date rangeEnding = signUpAnniversary.getTime();
        System.out.println(rangeEnding);

        if(rangeEnding.compareTo(currentDate) >0)
            rangeEnding = currentDate;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String range = formatter.format(rangeBeginning)+" "+formatter.format(rangeEnding);
        return range;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numOfTestCases = sc.nextInt();
        for(int i=0 ;i<numOfTestCases ; i++){
            System.out.println("signUp Current");
            System.out.println("dd-mm-yyyy dd-mm-yyyy");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String datesInput = reader.readLine();

            String[] datesArray = datesInput.split(" ");

            String signUpdateString= datesArray[0];
            String currentDateString=datesArray[1];

            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date signUpDate = null;
            Date currentDate = null;
            try {
                 signUpDate = format.parse(signUpdateString);
                currentDate = format.parse(currentDateString);
            }
            catch (ParseException e) {
                e.printStackTrace();
            }

           // System.out.println(currentDate +"  "+signUpDate);
            System.out.println(rangeOfDates(signUpDate,currentDate));

        }
    }
}
