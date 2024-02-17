import java.util.*;
public class power {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int pow=sc.nextInt();
        int power1=1;
        for(int i=1;i<=pow;i++){
            power1*=number;}
            System.out.println(power1);
        

    }
}
