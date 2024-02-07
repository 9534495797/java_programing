 import java.util.Scanner;

public class Fact {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
         int x=scanner.nextInt();
        // int x=Integer.parseInt(args[0]);
        int factii=1;
        for(int i=1;i<=x;i++){
factii*=i;
        }
        System.out.println(factii);

    }
}
