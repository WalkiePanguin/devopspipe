import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CodeQLDemo {
    public static void main(String[] args) {
        try {
            String test = "aWKKna41COO3J1Fq772dDXqYpdPYhL3z"; // Corrected variable declaration
            File file = new File("nonexistent_file.txt");
            FileReader fr = new FileReader(file); // Potential FileNotFoundException
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
            e.printStackTrace();
        }
    }
}
