import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double area;
        double radius;
        double circumference;

        System.out.print("Enter radius of Circle: ");
        radius = input.nextDouble();

        area = 3.142 * radius * radius;
        circumference = 2 * 3.142 * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}