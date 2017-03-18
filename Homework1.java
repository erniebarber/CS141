/*
The first HW assignment was to print out Strings
and format currency output for an extra point.
(I went overboard and used NumberFormat instead of printf)

Ernie Barber
CS142
Fall 2016
*/

import java.text.NumberFormat;

public class Homework1 
{
   public static void main(String[] args)
   {
       
   //variables
   String payString; 
   String name = "Ernie Barber";
   int age = 49;
   double annualPay = 100000.0;
       
   //calculations:  None
       
   //Bonus: NumberFormat class has getCurrencyInstance.
   payString = NumberFormat.getCurrencyInstance().format(annualPay);
           
   //output
   System.out.println("My name is " + name + ", " + "my age is " + age
   + " and I hope to earn " + payString + "!");    
   }
}

