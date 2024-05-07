import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;;
public class StringPra {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            str1+=str.charAt(i);

        }
         System.out.println(str1);

        //2nd program
    //     String str=sc.nextLine();
    //     int j=1;
    // int n=str.length();
    // for(int i=0;i<n;i++){
    //     System.out.println(str.substring(0,j));
    //     j++;
  //  }

  //3rd program

//   String str=sc.nextLine();
//   StringBuilder str1=new StringBuilder();
//   int n=str.length();
//   for(int i=0;i<n;i++){
//     char ch=str.charAt(i);
//     if(Character.isUpperCase(ch)){
//         str1.append(ch);
//     }
//   }
//   System.out.println(str1);

//4th program
// char ch=sc.next().charAt(0);
// int val=(int)ch;
// System.out.println(val);


//5th program


    }
}
