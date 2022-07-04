package com.bridgelabz.basics;
import java.util.Scanner;

public class QuoReminder {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Dividend ");
        double Dividend = n.nextInt();
        System.out.println("Enter a Divisor ");
        double Divisor =n.nextInt();

        double Quotient= Dividend/Divisor;
        double Reminder=Dividend%Divisor;

        System.out.println("Quotient is "+Quotient);
        System.out.println("Reminder is "+Reminder);
    }
}
