import java.util.Scanner;

public class PrintName {

    static void printName() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        printName();
    }
}
