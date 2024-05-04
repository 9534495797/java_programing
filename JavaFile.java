import java.io.*;
import java.util.*;
public class JavaFile {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{

        
        File file=new File("example.txt");
        FileWriter fs=new FileWriter(file);
        fs.write("hello everyone!");
        fs.close();
System.out.println("content of the file: ");
FileReader reader=new FileReader(file);
int character;
while((character=reader.read())!=-1){
    System.out.print((char)character);
}
reader.close();

System.out.println("append content of the file: ");
String str=sc.nextLine();
FileWriter writer=new FileWriter(file,true);
writer.write(str);
writer.close();

System.out.println("reading the appended file");
FileReader reader1=new FileReader(file);
int character1;
while ((character1=reader1.read())!=-1) {
    System.out.print((char)character1);
}
reader1.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
