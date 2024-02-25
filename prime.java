import java.util.*;
public class prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=1){
            System.out.println("it is not a prime number");
            return;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("it is not a prime number");
                return;
            }
        }
        System.out.println("it is  a prime number");
    }
}
