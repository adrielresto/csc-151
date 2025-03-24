/**
 * This program...      //Your Block COMMENT Here  ////////////////////////////
 /**
 * 
 */ 
package bugged_02_restoadriel;
import java.util.Scanner;
public class Bugged_02_RestoAdriel {
    public static void main(String[] args){
        double dollars;
        double eurosPerDollar;
        double grossEuros;
        double fees;
        double netEuros;
        double rate;
        
     
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Dollars to Euros Converter.\n");            
        System.out.print("How many dollars do you want to convert? ");        
        dollars = keyboard.nextDouble();        
        System.out.print("What is the euros-per-dollar exchange rate? ");        
        eurosPerDollar = keyboard.nextDouble();        
        grossEuros = dollars * eurosPerDollar;        
        System.out.println(dollars + " Dollars => " + grossEuros
         + " Gross Euros.");
        System.out.print("\nWhat is the euros-per-dollar Fee Percentage % ? ");        
        rate = keyboard.nextDouble();     
        fees = grossEuros * rate / 100;
        netEuros = grossEuros - fees;
        System.out.println(dollars + " \tDollars\n " + 
                eurosPerDollar + " \tEuros Per Dollar Exchange Rate\n" +
                grossEuros + " \tGross Euros\n" +
                rate + " \tFee Percentage %\n" +
                fees + " \tFee in Euros\n" +
                netEuros + " \tNet Euros\n");        
}
}
