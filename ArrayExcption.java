import java.util.Scanner;

public class ArrayExcption {
           public static void main(String[] args) {
            // try {
            //     String[] arr = {"Rohit", "Shikar", "Virat", "Dhoni"};
            //     // Accessing an element beyond the array size (index 4)
            //     System.out.println(arr[2]);
            // } catch (ArrayIndexOutOfBoundsException e) {
            //     System.out.println("Error: " + e.getMessage());
            // }

            Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of the array: ");
        // int size = scanner.nextInt();

        // int[] arr = new int[size];

        // System.out.println("Enter " + size + " elements:");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = scanner.nextInt();
        // }

        // System.out.print("Enter an index (0 to " + (size - 1) + "): ");
        // int index = scanner.nextInt();

        // try {
        //     int element = arr[index];
        //     System.out.println("Element at index " + index + " is: " + element);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Error: Invalid index. Please enter a valid index.");
        // }
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
                }
        int  index;
        index=sc.nextInt();
        try{
            int element=arr[index];
            System.out.println(element);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
        }
    }
    

