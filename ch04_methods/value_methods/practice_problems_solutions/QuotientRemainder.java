import java.util.Scanner;

public class QuotientRemainder
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a non-negative integer.");
      int int1 = scan.nextInt();
      System.out.println("Enter a positive integer.");
      int int2 = scan.nextInt();
      
      int quotient = computeQuotient(int1, int2);
      int remainder = computeRemainder(int1, int2);
      
      System.out.printf("The quotient of %,d and %,d is %,d.  The remainder when " +
         "%,d is divided by %,d is %,d.%n", int1, int2, quotient, int1, int2, remainder);
      scan.close();   
   }
   
   public static int computeQuotient(int x, int y)
   {
      return x / y;
   }
   
   public static int computeRemainder(int x, int y)
   {
      return x % y;
   }   
}