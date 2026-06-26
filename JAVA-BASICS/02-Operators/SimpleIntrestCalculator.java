import java.util.Scanner;

public class SimpleIntrestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal Amount :  ");
        double Principal = sc.nextDouble()     ;
         
        System.out.print("Enter the rate of interest :  ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time in years");
        double time = sc.nextDouble(); // Time in years

        sc.nextLine();

        // Calculate simple interest
        double simpleInterest = (Principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
