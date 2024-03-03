import java.util.*;
public class diif {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    int x=num;
   
  do{
     x=x/10;
  }while(x>=10);
  int rem=num%10;
  System.out.println(x-rem);
    }
}
