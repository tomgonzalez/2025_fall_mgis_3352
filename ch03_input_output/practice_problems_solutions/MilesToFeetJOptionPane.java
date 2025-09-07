import javax.swing.JOptionPane;

public class MilesToFeetJOptionPane
{
   public static void main(String[] args)
   {  
      String milesString = JOptionPane.showInputDialog("Enter a distance in miles.");
      double miles = Double.parseDouble(milesString);
      
      double feet = 5280 * miles;
      
      JOptionPane.showMessageDialog(null, String.format("There are %,.2f feet " +
         "in %,.2f miles.", feet, miles));
   }
}