import java.util.*;
import java.io.*;
public class SqrtException {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{

        
        double num=sc.nextDouble();
if(num<0){
    throw new IllegalArgumentException("negative number not allowed");
}
System.out.println(Math.sqrt(num));

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

}
}
