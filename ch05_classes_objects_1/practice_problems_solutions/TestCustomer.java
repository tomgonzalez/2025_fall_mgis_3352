import java.util.Scanner;

public class TestCustomer
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter an id.");
      int id = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter a name.");
      String name = scan.nextLine();
      System.out.println("Enter a discount.");
      int discount = scan.nextInt();
      scan.close();
      
      Customer customer = new Customer();
      customer.setId(id);
      customer.setName(name);
      customer.setDiscount(discount);
      
      System.out.printf("id:  %d  name:  %s  discount:  %d%s%n", customer.getId(), customer.getName(),
         customer.getDiscount(), "%");            
   }
}