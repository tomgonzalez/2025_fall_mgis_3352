public class TestCircle
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1.0, "burnt orange");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
    }
}