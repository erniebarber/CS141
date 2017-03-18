/*
HW 7 was a rainfall counter by month for a year;
calculates total rainfall and avg rainfall by month
using two nested for loops.

Rainfall amounts come from user input.

Ernie Barber
CS141
Fall 2016 
*/

import java.util.Scanner;

public class Homework7
{
   public static void main(String[] args)
   {
   //variables
   int input_years;
   double rain;
   double avg_rain;
   double tot_rain = 0;
   int tot_months = 0;
   
   //create Scanner object for user's "year" input
   Scanner keyboard = new Scanner(System.in);
   System.out.println("How many years of rain data?");
   input_years = keyboard.nextInt();
   
   //check if user year input is negative
   if (input_years <= 0) 
      {
         System.out.println("You entered a negative number or zero;");
         System.out.println("How many years of rain data?");
         input_years = keyboard.nextInt();
      }
   
   //loop through years by month to collect rain data
   for(int years = 1; years < (input_years + 1); years++)
   {
      for(int month = 1;month <= 12;month++)
      {
        System.out.println("Enter year " + years + ", month " + month + " rain data in inches.");
        rain = keyboard.nextDouble();
        if (rain < 0) //check if user rain input is negative
          {
            System.out.println("You entered a negative number;");
            System.out.println("Enter year " + years + ", month " + month + " rain data in inches.");
            rain = keyboard.nextDouble();
          }
        tot_rain = tot_rain + rain;
        tot_months++; 
      }
   }
   
   //calculations
   avg_rain = tot_rain / tot_months;
   
   //output
   System.out.println("Total months: " + tot_months); 
   System.out.println("Total rainfall: " + tot_rain + " inches"); 
   System.out.printf("Average monthly rainfall: %.2f inches", avg_rain);

   }   
}
