import java.util.Scanner;

public class FactorialCalculator
{
   public static void main(String[] args)
   {
   //variables
   int number = 0;
   int factorial = 0;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Please enter number 1,2,3,4 or 5");
   number = keyboard.nextInt();
   
   switch(number)
   {
   case 5: factorial = number*4*3*2*1;System.out.println("The factorial is: "+ factorial); break;
   case 4: factorial = number*3*2*1;System.out.println("The factorial is: "+ factorial); break;
   case 3: factorial = number*2*1;System.out.println("The factorial is: "+ factorial); break;
   case 2: factorial = number*1;System.out.println("The factorial is: "+ factorial); break;
   case 1: factorial = number*1;System.out.println("The factorial is: "+ factorial); break;
   default: System.out.println("invalid input"); 

   }
   }
   
}