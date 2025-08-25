import java.util.Scanner;

public class ThreeIntegers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter three integers separated by spaces.");
      int first = scan.nextInt();
      int second = scan.nextInt();
      int third = scan.nextInt();
      
      int count = 0;
      if(first % 2 != 0)
      {
         count = count + 1;
      }
      if(second % 2 != 0)
      {
         count = count + 1;
      }
      if(third % 2 != 0)
      {
         count = count + 1;
      }
      
      System.out.printf("%d of the integers are odd.", count);            
   }
}