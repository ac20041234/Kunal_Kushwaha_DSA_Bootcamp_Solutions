package com.communityClassroom;

import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        //take the number as an input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println(" Kindly , enter the number : ");
        int n = sc.nextInt();

        //using the for loop to print the multiplication table
        for(int i = 1; i<=10;i++){
            System.out.println(n * i);
        }
    }
}
