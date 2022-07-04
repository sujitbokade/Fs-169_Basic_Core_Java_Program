package com.bridgelabz.basics;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a Year ");
        Scanner n = new Scanner(System.in);
        int Y = n.nextInt();

        if(Y%100==0 && Y%400==0 || Y%100!=0 && Y%4==0){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
    }
}
