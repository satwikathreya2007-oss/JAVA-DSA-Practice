import java.util.Scanner;

public class StudentDetailsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

       sc.nextLine(); // Consume newline

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Branch : " + branch);

        
    }
}