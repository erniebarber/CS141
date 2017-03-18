/*
HW11:
distance = speed * time
This is a method named distance that accepts a vehicle's speed 
and time as arguments, and returns the distance the vehicle has 
traveled in miles.

A couple more methods... 

Ernie Barber
CS141
Fall 2016

*/  
import java.util.Scanner;
public class Homework11

{
   public static void main(String[] args)
   {
   //vars
   double speed=0;
   double time=0;
   
   //user input
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter the speed in MPH");
   
   //calcs
   speed = keyboard.nextDouble();
   System.out.println("Please enter the trip time in minutes");
   time = keyboard.nextDouble();
   double calcDistance = distance(speed, time);
   
   //display results
   displayResults(speed,time,calcDistance);
   }
   
   public static double distance(double speed, double time)
   {
      double calcDistance = (speed * time) / 60;
      return calcDistance;
   }  
   
   public static void displayResults(double speed, double time, double calcDistance)
   {
      System.out.println("Distance traveled is: "+calcDistance+" miles");
   } 
}