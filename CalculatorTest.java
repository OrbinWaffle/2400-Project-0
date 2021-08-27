// Joshua Lai
// CS1400, section 03
// Project 8 – Calculator with Exception Handling
// 5/6/2021

import java.util.Scanner;

public class CalculatorTest
{
   public static void main(String[] args)
   {
      Calculator calc = new Calculator();
      Scanner kb = new Scanner(System.in);
      String input = "";
      boolean exit = false;

      System.out.println("Calculator is on.\nresult = "
                         + calc.getResult());

      do
      {
         try
         {
            input = kb.nextLine();
            if (input.length() == 0)
            {
               System.out.println("Must specify an operation.");
               continue;
            }
            else if (input.toUpperCase().trim().equals("R"))
            {
               System.out.println("final result = " + calc.getResult());
               exit = true;
               break;
            }
            calc.doCalculation(input);
            System.out.println("updated result = " + calc.getResult());
         }
         catch(UnknownOperatorException uoe)
         {
            System.out.println(uoe.getMessage());
         }
         catch(NumberFormatException nfe)
         {
            System.out.println("Invalid non-numeric operand.");
         }
      }while (exit == false);
      kb.close();
   }
}
