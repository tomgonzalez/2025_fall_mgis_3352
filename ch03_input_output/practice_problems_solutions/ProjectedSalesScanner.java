import java.util.Scanner;

public class ProjectedSalesScanner
{
   public static void main(String[] args)
   {      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter the total sales in dollars for " + 
         "the North division:  ");
      double northSales = scan.nextDouble();
      
      System.out.println("Enter the total sales in dollars for " + 
         "the South division:  ");
      double southSales = scan.nextDouble();
      
      double projectedNorthSales = northSales + 0.1 * northSales;
      double projectedSouthSales = southSales + 0.1 * southSales;
      
      System.out.printf("Projected sales for the North division are $%,.2f.%n",
         projectedNorthSales);

      System.out.printf("Projected sales for the South division are $%,.2f.%n",
         projectedSouthSales);
         
      scan.close();   
   }
}