import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        // In a program,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
            // System.out.print("Enter 1st No: ");
            // int a = sc.nextInt();
            // System.out.print("Enter 2nd No: ");
            // int b = sc.nextInt();
            // System.out.print("Enter 3rd No: ");
            // int c = sc.nextInt();

            // int average = (a+b+c)/3;
            // System.out.print("The avrage odf numbers is: "+ average);

        // Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.

            // System.out.print("Enter side of square: ");
            // float side = sc.nextFloat();

            // double area = side*side;
            // System.out.print("The area of square is: "+ area);

        // Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

            System.out.print("Enter pencil cost No: ");
            float a = sc.nextFloat();
            System.out.print("Enter pen cost: ");
            float b = sc.nextFloat();
            System.out.print("Enter eraser cost: ");
            float c = sc.nextFloat();

            float total = a+b+c;
            System.out.println("The total cost: "+ total);

            // float totalgst = total + (total/100)*18;
            float totalgst = total+ (0.18f*total);

            System.out.print("The total cost with GST : "+ totalgst);

    }
}
