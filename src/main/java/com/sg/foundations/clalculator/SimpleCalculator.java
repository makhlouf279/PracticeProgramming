package com.sg.foundations.clalculator;

public class SimpleCalculator {


    private double result;

    public SimpleCalculator() {

    }
//
    public void addition(double number1, double number2){
        result=number1 + number2;
        System.out.println( number1 + " + " + number2 + " = " +result);
    }
    
    
    public void subtraction(double number1, double number2){
        result=number1-number2;
        System.out.println( number1 + " - " + number2 + " = " +result);
    }
    public void multiplication(double number1, double number2){
        result=number1*number2;
        System.out.println( number1 + " * " + number2 + " = " +result);
    }
    public void division(double number1, double number2){
        if(number2 !=0){
            result=number1/number2;
            System.out.println( number1 + " / " + number2 + " = " +result);
        }else{
            System.out.println(" ERROR ...... we cant devide by zero ");
        }


    }


}
