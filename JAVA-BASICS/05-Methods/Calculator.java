import java.util.*;


public class Calculator {
    
    static void Add ( int x,int y){
System.out.println("The Addition of two numbers are : "+(x+y));
    }

     static void Sub ( int x,int y){
System.out.println("The Subraction of two numbers are : "+(x+y));
    }
 
     static void Mul ( int x,int y){
System.out.println("The Multiplaction of two numbers are : "+(x+y));
    }
 
     static void Div ( int x,int y){
System.out.println("The Divition of two numbers are : "+(x+y));
    }

    public static void main(String[] args) {
        Add(10,20);
        Sub(10, 20);
        Mul(10, 20);
        Div(10, 20);
        
    }
}
