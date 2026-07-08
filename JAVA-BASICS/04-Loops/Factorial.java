import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.print("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.print("The Factorial of the given number is :  " + fact);
        }
        sc.close();
    }
}
