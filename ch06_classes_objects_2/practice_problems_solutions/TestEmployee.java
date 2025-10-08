public class TestEmployee
{
   public static void main(String[] args)
   {
      Employee employee1 = new Employee(6000, 1, "Alice", "Atwell");
      Employee employee2 = new Employee(2, "Bob", "Brown");
      
      System.out.println(employee1);
      System.out.println(employee2);
      
      employee1.raiseSalary(20);
      employee2.setSalary(4000);
      employee2.raiseSalary(10);
            
      System.out.println(employee1);
      System.out.println(employee2);      
   }
}