public class TestName
{
   public static void main(String[] args)
   {
      Name name1 = new Name("Mycroft", "Percival", "Farnsworth-Huffington",
         "Mr.", "III", "Percy", 37432);
      System.out.println(name1);
      
      Name name2 = new Name("Janesally", "Alice", "Smith", "Dr.", "Esq.",
         "Jane", 37433);
         
      System.out.println(name1);                  
      System.out.println(name2);
      
      System.out.println(name1.familyNameFirstName());
      System.out.println(name2.familyNameFirstName());    
   }
}