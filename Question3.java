import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double orignalprice;
        double discountpercentage;
        double discountedprice;

        System.out.print("Enter orignal price: ");
        orignalprice = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        discountpercentage = input.nextDouble();
        discountedprice = orignalprice - (orignalprice * discountpercentage / 100);

        System.out.println("Discounted Price : " + discountedprice);
    }
}