
import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Say Hello");
        System.out.println("2. Display Current Year");
        System.out.println("3. Print Your Name");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Hello! Welcome to Java.");
                break;

            case 2:
                System.out.println("Current Year: 2026");
                break;

            case 3:
                System.out.print("Enter your name: ");
                sc.nextLine(); // Clears the buffer
                String name = sc.nextLine();
                System.out.println("Hello, " + name + "!");
                break;

            case 4:
                System.out.println("Thank you! Exiting the program.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}