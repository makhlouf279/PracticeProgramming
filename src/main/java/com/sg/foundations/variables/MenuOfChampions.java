package com.sg.foundations.variables;

public class MenuOfChampions {
    public static void main(String[] args) {

        String food1,food2,food3;
        double priceOfPizza,priceOfPie,priceOfOmlet;
        food1 ="Pizza";
        food2="Pie";
        food3 ="Omlet";
        priceOfPizza = 500.00;
        priceOfOmlet= 1.50;
        priceOfPie=2.00;


        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo. \n\n");

        System.out.println("WELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("Today's Menu Is... \n\n");

        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo. \n\n");

        System.out.println("$ " + priceOfPizza + " *** Slice of Big Rico " + food1);
        System.out.println("$ " + priceOfPie + " ***** Invisible Strawberry " +food2 );
        System.out.println("$ " + priceOfOmlet + " ***** Denver " +food3);

    }
}
