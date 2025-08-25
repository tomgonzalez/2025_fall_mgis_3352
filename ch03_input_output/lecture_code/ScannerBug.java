import java.util.Scanner;

/**
*
* This example illustrates the Scanner bug
* and how to fix it.
*
*/

class ScannerBug
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a whole number:  ");
      int number = scan.nextInt();
      
      /* To fix the Scanner bug, uncomment the next statement, but
         make sure that you run the program once without uncommenting
         to see the effect of the Scanner bug. */
          
      // scan.nextLine();
      
      System.out.println("Enter your name:  ");
      
      /* The Scanner bug is usually caused when the nextInt
         or nextDouble method is used to read a number before 
         using the nextLine method to read a String. */
         
      String name = scan.nextLine();
      
      System.out.println("Name:  " + name + "  Number:  " + number);
      
      scan.close();
   }
}