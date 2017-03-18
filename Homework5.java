/*
HW 5 was a customer rewards calculator based on 
number of book purchases using a switch.

Bonus point:  Test for negative user input

Ernie Barber
CS141
Fall 2016 
*/

import java.util.Scanner;

public class Homework5
{
   public static void main(String[] args)
   {
   //variables
   int books;
   int points;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter number of books purchased");
   books = keyboard.nextInt();
   
   //Bonus: Test for negative number input from user
   while (books < 0)
      {
         System.out.println("You entered a negative number!\n"+
         "Please enter number of books purchased");
         books = keyboard.nextInt();
      }

   switch(books)
   {
   case 0: points = 0; break;
   case 1: points = 5; break;
   case 2: points = 15; break;
   case 3: points = 30; break;
   default: points = 60; 
   }
   
   System.out.println("You earned " + points + " points.");
   }  
}
