/*
HW 3 was a star pattern:
    *
   ***
  *****
 *******
  *****
   ***
    *

Bonus point:  use a for loop to display pattern
Strategy is to recognize the pattern then code it.

Ernie Barber
CS141
Fall 2016 
*/

public class Homework3 
{
   public static void main(String[] args)
   {
   //variables
   int counter;
   int spaces;
   int stars;
   
   //counter, loops for spaces, stars for top half
   for (counter = 0; counter < 7; counter+=2)
   {  
      for (spaces = 8; spaces > (counter / 2); spaces--)
      {
         System.out.print(" "); 
      }
         for (stars = 1; stars < counter; stars++)
         {         
            System.out.print("*");
         }
   System.out.println();
   }
  
   //counter, loops for spaces, stars for bottom half
   for (counter = 8; counter > 1; counter-=2)
   {  
      for (spaces = 8; spaces > (counter/2); spaces--)
      {
         System.out.print(" "); 
      }
         for (stars = 1; stars < counter; stars++)
         {         
            System.out.print("*");
         }
   System.out.println();
   }
   }
}

