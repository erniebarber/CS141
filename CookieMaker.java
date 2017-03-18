/*
This program demos JOptionPane, getting user input
as a variable and performaing calculations.
 
Ernie Barber
CS141
Fall 2016
*/

import javax.swing.JOptionPane;

public class CookieMaker
{
   public static void main(String[] args)
   {
      //variables
      String input; 
      double sugar = 1.5;
      double butter = 1;
      double flour = 2.75;
      Double cookies; //using a double avoids int division issues
      double totalSugar, totalButter, totalFlour;
      
      //get input
      input = JOptionPane.showInputDialog("How many cookies do you want to make?");
      cookies = Double.parseDouble(input);
      
      //calculations
      totalSugar = sugar * (cookies / 48);
      totalButter = butter * (cookies / 48);
      totalFlour = flour * (cookies / 48);
  
      //display result
      JOptionPane.showMessageDialog(null,"You will need " + totalSugar + " cups of sugar, " +
      totalButter + " cups(s) of butter, and " + totalFlour + " cup(s) of flour.");
      System.exit(0);
   }
}
