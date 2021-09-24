package com.sg.foundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        String name1  = input.nextLine();
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        String name2  = input.nextLine();
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");
        String name3  = input.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        String name4  = input.nextLine();
        System.out.println();
        System.out.println("Wow, 1,024 Gigabytes is a " +name2 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + name3 + " !I didn't know" );
        System.out.println("That's amazing that " +name4 + " is the most abundant element in the atmosphere...");
        System.out.println(name1 + "  is the only planet that rotates clockwise, neat!");

    }
}
