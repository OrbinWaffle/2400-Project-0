// Joshua Lai
// CS1400, section 03
// Project 8 – Calculator with Exception Handling
// 5/6/2021

public class Calculator
{
   private double result;

   public Calculator()
   {
      result = 0.0f;
   }
   public double getResult()
   {
      return result;
   }
   public void doCalculation(String expression)
                            throws UnknownOperatorException,
                                   NumberFormatException
   {
      Character operator = null;
      double number = 0;
      int index = 0;
      for(index = 0; index < expression.length(); index++)
      {
         if(operator == null
            && !Character.isWhitespace(expression.charAt(index)))
         {
            operator = expression.charAt(index);
            break;
         }
      }
      if (operator != '+' && operator != '-'
          && operator != '*'&& operator != '/')
      {
         throw new UnknownOperatorException(operator);
      }
      number = Double.parseDouble(expression.substring(index + 1));
      if(operator == '+')
      {
         result += number;
      }
      else if (operator == '-')
      {
         result -= number;
      }
      else if (operator == '*')
      {
         result *= number;
      }
      else if (operator == '/')
      {
         result /= number;
      }
   }
}
