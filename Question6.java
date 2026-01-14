import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double height;
        double area;

        System.out.print("Enter length of First parallel side: ");
        a = input.nextDouble();
        System.out.print("Enter length of Second parallel side: ");
        b = input.nextDouble();
        System.out.print("Enter heigth (the perpendicular distance between these two parallel lines): ");
        height = input.nextDouble();
        
        area=height * (a+b)/2;

        System.out.println("Area of Trapezoid = " + area);
    }
}
