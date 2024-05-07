import java.util.*;
import java.io.*;
public class ErrorHandling{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        try{
            System.out.println(x/y);
        }catch(ArithmeticException e){
            System.out.println("Error: denominater is zero!");
        }
    }
}