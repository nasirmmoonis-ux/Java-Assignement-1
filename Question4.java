import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double orignalprice;
        double discountpercentage;
        double discountedprice;

        System.out.print("Enter discounted price: ");
        discountedprice = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        discountpercentage = input.nextDouble();
        orignalprice = discountedprice / (1 - discountpercentage / 100);

        System.out.println("Orignal Price : " + orignalprice);
    }
}