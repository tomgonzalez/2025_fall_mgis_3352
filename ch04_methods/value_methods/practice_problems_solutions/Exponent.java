import javax.swing.JOptionPane;

class Exponent
{
   public static void main(String[] args)
   {
      String numberString = JOptionPane.showInputDialog("Enter an integer.");
      int number = Integer.parseInt(numberString);
      int square = squareNumber(number);
      int cube = cubeNumber(number);
      JOptionPane.showMessageDialog(null,
         String.format("The square of %,d is %,d.  The cube of %,d is %,d.", number, square, number, cube));
      
      
   }
   
   public static int squareNumber(int x)
   {
      int square = x * x;
      return square;
   }
   
   public static int cubeNumber(int x)
   {
      int cube = squareNumber(x) * x;
      return cube;
   }
}
 