import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        FileReader reader = new FileReader(file);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close(); // Close the reader when done to release resources
    }
}

