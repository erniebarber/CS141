/*
HW10:
 A painting company has determined that for every 115 square feet of wall
 space,one gallon of paint and eight hours of labor will be required. The 
 company charges $18.00 per hour for labor. This program that allows the 
 user to enter the number of rooms to be painted, the price of the paint 
 per gallon and the square feet of wall space in each room.
 
Several methods and calls...

Ernie Barber
CS141
Fall 2016
**/

import javax.swing.JOptionPane;

public class Homework10
{
   public static void main(String[] args)
   {
      String input;
      double feet;
      double rooms;
      double feetCounter = 0;
      double totalFeet = getSquareFeet(); 
      double totalGallons = getGallons(totalFeet);
      double paintPrice = getPaintPrice();
      double totalLabor = getLaborCost(totalFeet);
      double jobCost = getJobCost(totalLabor, paintPrice, totalFeet);
      double paintCost = getPaintCost(paintPrice, totalFeet);
      displayJobInfo(totalFeet,paintPrice,totalGallons,paintCost,totalLabor,jobCost);
   }
   
   public static double getSquareFeet()
   {
      //get number of rooms and sq feet for each room
      double totalFeet = 0;
      String input =JOptionPane.showInputDialog("How many rooms?");
      double rooms = Double.parseDouble(input);
      for (int i = 1; i<= rooms; i++)
         {  
            input = JOptionPane.showInputDialog("How many square feet in room " + i + " ?");
            double feet = Double.parseDouble(input);
            totalFeet = totalFeet + feet;
         }
      return totalFeet;
   } 
    
   public static double getPaintPrice()
   {
      //get the price of paint
      String input =JOptionPane.showInputDialog("What is the price per gallon of paint?");
      double paintPrice = Double.parseDouble(input);
      return paintPrice;
   } 
     
   public static double getGallons(double totalFeet)
   {
      //calculate the number of gallons needed
      double totalGallons = totalFeet / 115;
      return totalGallons;
   } 
    
   public static double getLaborCost(double totalFeet)
   {
      //calculate the labor cost
      double totalLabor = (totalFeet / 115) * 18.0 * 8;
      return totalLabor;
   } 
    
   public static double getJobCost(double totalLabor, double paintPrice, double totalFeet)
   {
      //calculate total job cost
      double totalCost = totalLabor + (paintPrice * totalFeet / 115);
      return totalCost;
   } 
    
    
   public static double getPaintCost(double paintPrice, double totalFeet)
   {
      //calculate total paint cost
      double paintCost = paintPrice*(totalFeet / 115);
      return paintCost;
   }  
    
    
   public static void displayJobInfo(double totalFeet,double paintPrice, 
               double totalGallons,double paintCost,double totalLabor,double jobCost)   
   {
       JOptionPane.showMessageDialog(null,"Total feet: " + totalFeet +
       String.format("\nPaint price: $%.2f",  paintPrice)+
       String.format("\nTotal gallons: %.2f", totalGallons)+
       String.format("\nPaint Cost: %.2f", paintCost)+
       String.format("\nTotal labor: $%.2f", totalLabor)+
       String.format("\nTotal job cost: $%.2f", jobCost));    
       System.exit(0);
   } 

}
