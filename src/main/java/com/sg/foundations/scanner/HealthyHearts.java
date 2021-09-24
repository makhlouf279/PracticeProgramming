package com.sg.foundations.scanner;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        int res = 220 - age ;
        int x1 = age + 35;
        int x2 = res - 25;
        System.out.println("Your maximum heart rate should be " + res + " beats per minute.");

        System.out.println("Your target HR Zone is " + x1 + " - " + x2 + " beats per minute.");
    }
}
