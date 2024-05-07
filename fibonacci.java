import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
            int b=1;
            int c;
            boolean isfirst=true;
        do{
            
if(!isfirst){
    System.err.println(" ");

}
System.out.println(a);
c=a+b;
a=b;
b=c;
isfirst=false;
        }while(a<=num);
    }
}
