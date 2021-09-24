package com.sg.foundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print(" What's your name? ");
         String name1  = input.nextLine();
        System.out.println();
        System.out.println("Hi, " + name1 + "!  I'm Alice.");

        System.out.print(" What's your favorite color? ");
        String color1  = input.nextLine();
        System.out.println();
        System.out.println("Huh, " + color1 + " ? Mine's Electric Lime.");
        System.out.println();
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.print("What's YOUR favorite fruit, " + name1 + "? ");
        String fruit1  = input.nextLine();
        System.out.println();
        System.out.println("Really? " + fruit1 + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");
        int number  = Integer. parseInt(input.nextLine());
        System.out.println();
        System.out.println( number + " is a cool number. Mine's -7.");
        int res = number * (-7);
        System.out.println("Did you know " + number + "  *  -7   is " + res + " ? That's a cool number too!");
        System.out.println();
        System.out.println("Well, thanks for talking to me, " + name1 + "!");



    }
}
