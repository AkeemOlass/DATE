import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */
public class MyDate {
    /**DDate converts each millisecond to a date format then to a string format
     * then multiplies the initialmillisec by 10 to get the next millisecond
     * @param initialMillisecValue
     * @param numberofmilliTotest
     * @return
     */
    public static String DDate(int initialMillisecValue, int numberofmilliTotest ){
        java.util.Date date = new java.util.Date();

        for (int i = 0; i <= numberofmilliTotest; i++) {
            date.setTime(initialMillisecValue);
            System.out.println(date.toString());
            initialMillisecValue=initialMillisecValue* 10;

        }
    return date.toString();
    }
    /** there are 8 milliseconds to convert to a date according to the question
     * numberofmmillitoTest specifies those 8
     * initialMillisecValue is the first milisecond of the 8
     */

    public static void main(String[] args) {

        int numberofmilliTotest = 8;
        int initialMillisecValue = 1000;
       // BigInteger multplicator = BigInteger.valueOf(10);
            DDate(initialMillisecValue,numberofmilliTotest);




    }
    }

