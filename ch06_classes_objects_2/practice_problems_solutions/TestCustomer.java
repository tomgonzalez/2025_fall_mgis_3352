public class TestCustomer
{
   public static void main(String[] args)
   {
      Customer customer1 = new Customer(152, "Brooks Koepke");
      Customer customer2 = new Customer(25, 3452, "Rickey Fowler");
      
      System.out.println(customer1);
      System.out.println(customer2);
      
      customer1.setName("BK");
      customer2.setName("RF");
      
      System.out.println(customer1);
      System.out.println(customer2);       
   }
}