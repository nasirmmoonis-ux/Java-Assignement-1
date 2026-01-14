import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double amps;
        double volts;
        double watts;

        System.out.print("Enter Current : ");
        amps = input.nextDouble();
        System.out.print("Enter Voltage marks: ");
        volts = input.nextDouble();
        watts = amps * volts;

        System.out.println("Power = " + watts + " Watts");
    }
}