import java.io.*;
import java.util.*;

public class FileOperation {
    public static void main(String[]args){
        File file=new File("ab.txt");
        boolean created=file.createNewFile();
        if(created){
            System.out.println("success");
        }else{
            System.out.println("failed");
        }
    }
}
