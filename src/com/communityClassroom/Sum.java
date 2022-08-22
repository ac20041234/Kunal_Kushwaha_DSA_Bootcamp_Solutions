package com.communityClassroom;
import java.util.*;

public class Sum {

    public static void main(String[] args) {
        //take two numbers as input from the user and print it out it's sum
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //to print the sum of the two integers
        int Sum = n1 + n2;
        System.out.println(" sum is : " + Sum);
    }
}
