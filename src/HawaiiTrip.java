/*
  Rishika Reddy
 */

import java.util.Scanner;
import java.util.HashMap;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.DAYS;

public class HawaiiTrip {
    static int convertMonthNameToNumber(String monthName){
        HashMap<String, Integer> month = new HashMap();
        month.put("JANUARY", 1);
        month.put("FEBRUARY", 2);
        month.put("MARCH", 3);
        month.put("APRIL", 4);
        month.put("MAY", 5);
        month.put("JUNE", 6);
        month.put("JULY", 7);
        month.put("AUGUST", 8);
        month.put("SEPTEMBER", 9);
        month.put("OCTOBER", 10);
        month.put("NOVEMBER", 11);
        month.put("DECEMBER", 12);

        return month.get(monthName);
    }

    static LocalDate getFirstMonday(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate dateOfFirstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2014-07-07
        return dateOfFirstMonday;
    }

    static LocalDate getLastSunday(int year,int month){
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate dateOfLastSunday = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); // 2014-07-07
        return dateOfLastSunday;

    }
    static long numOfWeeks(int year, String startMonth, String endMonth, String firstDayOfJan){
        int startMonthNum = convertMonthNameToNumber(startMonth);
        LocalDate firstDayOfVacation = getFirstMonday(year, startMonthNum);

        int endMonthNum = convertMonthNameToNumber(endMonth);
        LocalDate lastDayOfVacation = getLastSunday(year, endMonthNum);

        long numOfDays = DAYS.between(firstDayOfVacation,lastDayOfVacation);
        long numOfWeeks = (numOfDays+1)/7;

        return numOfWeeks;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        System.out.println("Vacation starts in the month (Enter full name) : ");
        String startMonth = sc.next();
        startMonth = startMonth.toUpperCase();

        System.out.println("Vacation ends in the month (Enter full name) : ");
        String endMonth = sc.next();
        endMonth = endMonth.toUpperCase();

        System.out.println("First Day of January : ");
        String firstDayOfJan = sc.next();

        System.out.print("Number of weeks John can spend in Hawaai = ");
        System.out.print(numOfWeeks(year,startMonth,endMonth,firstDayOfJan));
    }
}
