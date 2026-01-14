import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an Integer: ");
        number = input.nextInt();
        if (number %2 == 0) {
     System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }
}