// Joshua Lai
// CS1400, section 03
// Project 8 – Calculator with Exception Handling
// 5/6/2021

public class UnknownOperatorException extends Exception
{
   public UnknownOperatorException()
   {
      super("Unknown operator entered.");
   }
   public UnknownOperatorException(Character operator)
   {
      super(operator + " is an unknown operation.");
   }
}
