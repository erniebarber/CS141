/*
class assigment to convert cups to ounces.
user enters cups via JoptionPane.
methods called for user inout, calc cups to ounces
and to display output

Ernie Barber
CS141
Fall2016

*/  

import javax.swing.JOptionPane;

public class CupsToOunces
{
   public static void main(String[] args)
   {
      String input;
      double cups, ounces;
      cups = getCups();
      ounces = cupstoOunces(cups);
      displayResults(cups,ounces);
   }
   
   public static double getCups()
   {
      String input = JOptionPane.showInputDialog("How many cups?");
      double cups = Double.parseDouble(input);
      return cups;
   }
    
   public static double cupstoOunces(double cups)
   {
      double ounces = cups * 8.0;
      return ounces;
   }
   
   public static void displayResults(double cups, double ounces)   
   {
      JOptionPane.showMessageDialog(null,cups + " cup(s) equals " + ounces + " ounces");
      System.exit(0);
   } 
   
}