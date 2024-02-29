import java.util.*;
public class array_max_min {
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        // int[]arr={1,2,3,4,5,6};
      
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//         int sum=0;
//         for(int i=0;i<=arr.length;i++){
//             sum+=i;
//         }
// System.out.println(sum);
//to find largest elemenet in array
int maximum=arr[0];

for(int i=1;i<arr.length;i++){
    if(arr[i]<maximum){
        maximum=arr[i];
    
   }
 
}
System.out.println(maximum);
    }
}


