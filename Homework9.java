/*
HW 9 is a game; user tries to guess the  computer's
color ten times.  Uses a switch to convert random int into the
computers color.  totals number of correct guesses.
 
Ernie Barber
CS141
Fall 2016 
*/

import java.util.*;

public class Homework9
{
   public static void main(String[] args)
   {
   //variables
   int compNum;
   String userGuess;
   int userNum = 0;
   int correctGuess = 0;
   String color ="";
   
   //create scanner and random objects
   Random r = new Random();
   Scanner keyboard = new Scanner(System.in);
   
   //user guesses computers color choice
   //after the user guesses the computer makes it's choice
   for (int i = 1; i <= 10; i++)//ten rounds are played
   {
      //System.out.println("The computer's going to choose a color,");
      System.out.println("Please guess: 'red', 'green', 'blue', 'orange' or 'yellow'" );
      userGuess = keyboard.next();
      compNum = r.nextInt(5);//5 colors
      
      switch(compNum)
      {
      case 0: color = "red"; break;
      case 1: color = "green"; break;
      case 2: color = "blue"; break;
      case 3: color = "orange"; break;
      case 4: color = "yellow"; break;
      default: System.out.println("Invalid input");
      System.out.println("The computer chose this color: " + color); 
      }
      
      if (color.equals(userGuess))
          {
          correctGuess ++;
          System.out.println("You guessed the computer's color!: " + color);
          }
      else
          {
          System.out.println("You guessed incorrectly : " + userGuess);
          System.out.println("The computer chose : " + color);
          }
          
   System.out.println("guesses remaining : " + (10 - i));
   }
   System.out.println("");
   System.out.println("You were correct : " + correctGuess + " times");
   }   
}
