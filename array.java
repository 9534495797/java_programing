import java.util.*;
public class array {
    public static void main(String[]args){
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
     
        for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
        }
        System.out.println("enter element to search: ");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            if(arr[i]==search){
                System.out.println("element found at index "+i);
            }
        }
    }
}
