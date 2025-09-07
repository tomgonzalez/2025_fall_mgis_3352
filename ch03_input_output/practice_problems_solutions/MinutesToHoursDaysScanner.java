import java.util.Scanner;

public class MinutesToHoursDaysScanner
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of minutes.");
      int minutes = scan.nextInt();
      
      double hours = minutes / 60.0;
      double days = minutes / 1440.0;
      
      System.out.printf("%,d minutes equals %,.2f hours and %,.2f days.", minutes, hours, days);
      
      scan.close();      
   }
}