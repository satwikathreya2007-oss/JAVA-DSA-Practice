import java.util.*;

public class PositiveOrNegitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :  ");
        int a = sc.nextInt();

        if ( a>0){
            System.out.println("It is a positive Number");
        }else{
            if(a<0){
                System.out.println("The number is Negative Number");
            }else{
                System.out.println("The number is Zero");
            }
        }
    }
}
