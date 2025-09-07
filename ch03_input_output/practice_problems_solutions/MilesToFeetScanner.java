import java.util.Scanner;

public class MilesToFeetScanner
{
   public static void main(String[] args)
   {  
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a distance in miles.");
      double miles = scan.nextDouble();
      
      double feet = 5280 * miles;
      
      System.out.printf("There are %,.2f feet in %,.2f miles.", feet, miles);
      scan.close();
   }
}