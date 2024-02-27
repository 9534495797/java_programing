import java.util.*;
public class array2d {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int colns=sc.nextInt();

        int arr[][]=new int[rows][colns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("element to search");
        int search=sc.nextInt();
        System.out.println("print given data: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colns;j++){
                // System.out.println(arr[i][j]);
                if(arr[i][j]==search){
                    System.out.println(search+" found at index"+i+" "+j);
                }
            }
        }

    }
}
