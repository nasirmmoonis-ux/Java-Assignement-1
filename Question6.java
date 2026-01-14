import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double height;

        System.out.print("Enter obtained marks: ");
        obtained = input.nextDouble();
        System.out.print("Enter Maximum marks: ");
        maximum = input.nextDouble();
        percentage = (obtained / maximum) * 100;

        System.out.println("Percentage = " + percentage + " %");
    }
}