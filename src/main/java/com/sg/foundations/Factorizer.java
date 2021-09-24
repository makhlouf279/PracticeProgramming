package com.sg.foundations;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
            facturiel();

    }
    public  static void facturiel(){
      int numberOfFactors =0;
      int perfectNumber =0;
      int primeNumber=0;
      int res=0;
      int []fac = new int [100];
        Scanner input = new Scanner(System.in);
        System.out.print("What number would you like to factor?");
        int number = input.nextInt();
        System.out.println("The factors of 6 are: ");
        for(int i= 0; i<number; i++){
            if(number % (number-i)==0){
                 fac [i] = number-i;
                System.out.println(fac[i]);
                  numberOfFactors += 1;
            }

        }
        System.out.println(number  + " has " + numberOfFactors + " factors");

        for(int j=0; j<fac.length; j++){
            res += fac[j];
        }
        if(number == (res -number)){
                      perfectNumber =number;
            System.out.println( perfectNumber + " is a perfect number.");
        }else{
            System.out.println("the number is not perfect.. ");
        }

        if(number>1 && res==number+1){
            primeNumber=number;
            System.out.println( primeNumber + " is a prime number.");
        }else{
            System.out.println("the number is not prime.. ");
        }




    }

}
