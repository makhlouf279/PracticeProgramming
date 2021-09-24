package com.sg.foundations.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("how many miles you can run? ");
        int miles = input.nextInt();
        int rest1 = (miles * 2) + 1;
        System.out.println(rest1);
        System.out.println();

        System.out.print("the number of hot dogs you can eat? ");
        int hot = input.nextInt();
        int rest2 = (hot * 2) + 1;
        System.out.println(rest2);

        System.out.print("the number of languages you know? ");
        int language = input.nextInt();
        int rest3 = (language * 2) + 1;
        System.out.println(rest3);

    }
}
