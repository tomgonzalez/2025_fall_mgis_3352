import javax.swing.JOptionPane;

public class KennelJOptionPane
{
   public static void main(String[] args)
   {
      String weightString = JOptionPane.showInputDialog("Enter the dog's weight in pounds.");
      String daysString = JOptionPane.showInputDialog("Enter the number of days to be boarded.");
      
      double weight = Double.parseDouble(weightString);
      int days = Integer.parseInt(daysString);
      
      double cost = 0.50 * weight * days;
      
      JOptionPane.showMessageDialog(null, String.format("The cost to board a dog that weighs %,.1f pounds " +
         "%,d days is $%,.2f.", weight, days, cost)); 
   }
}