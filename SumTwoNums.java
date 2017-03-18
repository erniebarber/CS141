/*
class ex:  get user input of two numbers and sum
them up using 3 methods; input, calc and display

Ernie Barber
CS141
Fall2016
*/


import java.util.Scanner;

public class SumTwoNums

{
   public static void main(String[] args)
   {
   //vars 
   double sum,num1,num2;
   num1 = getInput();
   num2 = getInput();
   
   //calcs
   sum = sumofTwo(num1,num2);
   
   //display output
   displayMessage(sum);
   
   }
   //get user input from user using a method
   public static double getInput()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter an integer ");
      double num = keyboard.nextDouble();
      return num;
   }

   public static double sumofTwo(double num1, double num2)
   {
      double sum = num1 + num2;
      return sum;
   }
   
   public static void displayMessage(double sum)
   {
      System.out.println("The sum is :" + sum);
   }
     
}