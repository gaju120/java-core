import java.io.FileReader;
import java.io.IOException;

class throwEx  {
    public static void readfile() throws IOException {
        FileReader fr = new FileReader("abc.txt");  
        System.out.println("File opened successfully!");
        fr.close(); // good practice to close the file
    }

    public static void main(String[] args) {
        try {
            readfile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}