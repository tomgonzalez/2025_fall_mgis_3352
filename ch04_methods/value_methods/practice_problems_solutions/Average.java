import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an integer.");
      int int1 = scan.nextInt();
      System.out.println("Enter another integer.");
      int int2 = scan.nextInt();
      double avg = computeAverage(int1, int2);
      System.out.printf("The average of %,d and %,d is %,.2f.%n", int1, int2, avg);
      scan.close();
   }
   
   public static double computeAverage(int x, int y)
   {
      return (x + y) / 2.0;
   }
}