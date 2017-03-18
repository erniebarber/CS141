/*
Printout each second of a 12 hour clock 
using nested for loops.
 
Ernie Barber
CS141
Fall 2016
*/

public class ClockSeconds
{
   public static void main(String[] args)
   {
   //variables
   int hour;
   int min;
   int sec;
   
   for(hour = 0; hour <= 12; hour++)
   {
      for(min = 0; min <= 59; min++)
      {
         for(sec=0; sec<= 59; sec++)
         {
            System.out.printf("%02d:%02d:%02d\n", hour,min,sec);
         }
      }
   }

   }   
}
