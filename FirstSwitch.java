/*
In class ex: simple switch

Ernie Barber
CS141
Fall2016

*/

import java.util.Scanner;

public class FirstSwitch
{
   public static void main(String[] args)
   {
   //variables
   int number;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter a 1,2,3");
   number = keyboard.nextInt();
   
   switch(number)
   {
   case 1: System.out.println("January"); break;
   case 2: System.out.println("Feburary"); break;
   case 3: System.out.println("March"); break;
   default: System.out.println("invalid imput"); 
   }
   }
   
}
