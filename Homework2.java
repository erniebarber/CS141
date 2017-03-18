/*
HW 2 was a tip calculator for  a restuarant bill 
that uses Scanner, JOptionPane and NumberFormat.
Bonus point:  use JOptionPane to display data

Ernie Barber
CS141
Fall 2016 
*/


import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Homework2  //Restaurant bill
{
   public static void main(String[] args)
   {
       
   //variables 
   double meal;
   double taxpaid;
   double taxAmount;
   double tipAmount;
   double totalBill;
   double tip = .20; 
   double tax = .06; 
   String mealString;
   String tipString;
   String taxString;
   String billString;

   //input
   //create a scanner object to get meal cost from keyboard
   Scanner keyboard=new Scanner(System.in);
   System.out.println("How much was your meal charge?");
   meal = keyboard.nextFloat();
   
   //calculations
   taxAmount = meal * tax;
   tipAmount = meal * tip;  
   totalBill = meal + taxAmount + tipAmount;
     
   //output
   //Format the output as currency
   mealString = NumberFormat.getCurrencyInstance().format(meal);
   tipString = NumberFormat.getCurrencyInstance().format(tipAmount);
   taxString = NumberFormat.getCurrencyInstance().format(taxAmount);
   billString = NumberFormat.getCurrencyInstance().format(totalBill);
 
   //Dispaly meal charge, tax amount, tip amount, and total bill.
   //Bonus: Show output in a new window
   JOptionPane.showMessageDialog(null,"The details of your meal charge: "
   + "\n\tMeal cost: " + mealString   
   + "\n\tTax paid: " + taxString
   + "\n\tTip amount: " + tipString
   + "\n\tTotal bill: " + billString);

   System.exit(0); 
   }
}

