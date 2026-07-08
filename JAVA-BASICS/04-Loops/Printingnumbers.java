import java.util.*;

public class Printingnumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

         System.out.print("Enter how many numbers you want to printn : :");
         int a = sc.nextInt();
          
          for(int i = 0; i<=a;i++){
            System.out.print(i +" " );
          }
    }
}
