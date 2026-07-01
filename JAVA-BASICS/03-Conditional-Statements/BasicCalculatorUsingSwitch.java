import java.util.*;
public class BasicCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
         
        System.out.print("Enter the operation (+ , - , * , / ) : ");
        int c = sc.next().charAt(0);

        switch (c) {
            case '+':
                 System.out.print("Addition of two numbers : "+(a+b));
                break;
        
            case '-':
                System.out.println("Subraction of two numbers : "+(a-b));
                break;
               
            case '*' :
                System.out.println("Multiplication of two numbers : "+ (a*b));
                break;

            case '/': 
                 System.out.println("Division of two numbers : "+(a/b)); 
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();

    }
}
