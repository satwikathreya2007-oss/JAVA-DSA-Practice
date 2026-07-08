import java.util.*;
public class MultiplicationTable {
    public static void main (String []args){
     Scanner sc = new Scanner (System.in);

      System.out.print("Which table Do you want : ");
      int a = sc.nextInt();

       for (int i=1; i <= 50; i++ ){
         System.out.println(a+" x "+i+" = "+a*i );
       }


    }


}
