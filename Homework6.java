/*
HW 6 sorts input Strings (names) into
alphabetical order with a for loop and 
the Collections class.   

Ernie Barber
CS141
Fall 2016 
*/ 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Homework6
{
   public static void main(String[] args)
   {
   
   //variables
   String input;
   ArrayList<String> names = new ArrayList<>();
   
   //input
   for (int counter=1;counter<=3;counter++)
      {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("Please enter a name");
         input = keyboard.nextLine();
         names.add(input);//adds name to ArrayList names
      }
   
   //sort names
   Collections.sort(names);//sorts 
   
   //output
   for (int i = 0; i < names.size(); i++)//{} not needed
	    System.out.println(names.get(i));
   }  
}
