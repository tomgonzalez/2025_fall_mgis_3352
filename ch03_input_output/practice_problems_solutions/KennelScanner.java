import java.util.Scanner;

public class KennelScanner
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Enter your dog's weight in pounds:  ");
      double weight = scan.nextDouble();
   
      System.out.println("Enter the number of days to be boarded:  ");
      int days = scan.nextInt();
   
      double cost = 0.5 * weight * days;
   
      System.out.printf("The cost to board a dog that weighs %,.1f pounds for " +
         "%,d days is $%,.2f.%n", weight, days, cost);
         
      scan.close();
   }
}