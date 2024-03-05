import java.util.*;
public class string_reverse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String reversestring="";
        for(int i=name.length()-1;i>=0;i--){
            reversestring+=name.charAt(i);
        }
System.out.println(reversestring);
    }
}
