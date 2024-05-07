import java.util.*;
public class reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
try{
    if(num<0){
        throw new IllegalArgumentException("negative number not allowed");
    }
    System.out.println(num*num*num);
}catch(Exception e){
    System.out.println(e.getMessage());
}
    //     int rev=0;
    //     int rem;
    //     while(num>0){
    //         rem=num%10;
    //         rev=rev*10+rem;
    //         num/=10;
    //     }
    //     System.out.println(rev);
    // }
    }
}
