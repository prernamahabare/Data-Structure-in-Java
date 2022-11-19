import java.util.Scanner;

public class AreaofCircle {
    public static double pi = 3.14;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Area of circle is: "+ (pi*radius*radius));
    }
    
}
