import java.util.*;
public class reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int rev=0;
        int rem;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
