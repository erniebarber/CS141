/*
HW 4 converts seconds (>60) given by the user into either 
a minute, hour or day value.

Ernie Barber
CS141
Fall 2016 
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Homework4
{
   public static void main(String[] args)
   {
   //variables
   int seconds;
   float hours,days,minutes;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter number of seconds");
   seconds = keyboard.nextInt();
  
   //calculations
   //re-cast 'seconds' as a float to get accurate calculations
   minutes = (float)seconds / 60;
   hours = (float)seconds / 3600;
   days = (float)seconds / 86400;
   
   //use if, else if statements to test the seconds entered by user.  
   if (seconds >= 86400) 
      JOptionPane.showMessageDialog
      (null, String.format(seconds + " seconds = %.2f days", days));
   else if (seconds >= 3600)
      JOptionPane.showMessageDialog
      (null, String.format(seconds + " seconds = %.2f hours", hours));
   else if (seconds >= 60)
      JOptionPane.showMessageDialog
      (null, String.format(seconds + " seconds = %.2f minutes", minutes));
   else
      JOptionPane.showMessageDialog(null,
      "You entered less than 60 seconds!");
   }     
}   

