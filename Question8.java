import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double s;
        double area;

        System.out.print("Enter length of the First side: ");
        a = input.nextDouble();
        System.out.print("Enter length of the Second side: ");
        b = input.nextDouble();
        System.out.print("Enter length of the Third side: ");
        c = input.nextDouble();

        s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle = " + area);
    }
}