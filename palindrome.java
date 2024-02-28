import java.util.*;
public class palindrome {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int originalnum=num;
        int rev=0;
        int rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
        if(originalnum==rev){
            System.out.println("yes palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
