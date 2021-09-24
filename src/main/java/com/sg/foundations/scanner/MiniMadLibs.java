package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        System.out.print(" I need a noun: ");
        String noun = input.nextLine();
        System.out.print(" Now an adjective: ");
        String adjective = input.nextLine();
        System.out.print(" Another noun: ");
        String noun1 = input.nextLine();



        System.out.print("Another adjective: ");
        String adjective2 = input.nextLine();

        System.out.print("A plural noun: ");
        String pluralnoun1 = input.nextLine();

        System.out.print("Another one:  ");
        String pluralnoun2 = input.nextLine();

        System.out.print("One more:  ");
        String pluralnoun3 = input.nextLine();

        System.out.print("A verb (infinitive form): ");
        String verbpresenttense = input.nextLine();

        System.out.print("Same verb (past participle): ");
        String sameverbbutpasttense = input.nextLine();

        System.out.print(" And a number: ");
        int number = input.nextInt();
        System.out.println();



        System.out.println("*** NOW LETS GET MAD (libs) ***");

        System.out.println(noun + ": the " + adjective + " frontier. These are the voyages of the starship  \n" + noun1 +
                ". Its  " + number + " -year mission: to explore strange " + adjective2 + " " + pluralnoun1 +", \n" +
                " to seek out " + adjective2 + " " + pluralnoun2 + " and " + adjective2 + " " + pluralnoun3 +
                "\n, to boldly " + verbpresenttense + " where no one has " + sameverbbutpasttense + " before."   );






    }
}
