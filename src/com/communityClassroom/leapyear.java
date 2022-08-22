package com.communityClassroom;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        //Take an input from the user to check it out whether it is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly, enter the year : ");
        int year = sc.nextInt();
        boolean leap = false;

        //if it is divisible by 4
        if (year % 4 == 0) {
            //if the year is a century
            if (year % 100 == 0) {
                //in order to be a leap year
                //it must be divisible by 4
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            //if the year is not century
            else
                leap = true;

        } else
            leap = false;

        if(leap){
            System.out.println(" the year  " + year + " is a leap year ");
        }else{
            System.out.println(" the year " + year + " is not a leap year");
        }

    }
}