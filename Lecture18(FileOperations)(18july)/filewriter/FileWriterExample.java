import java.io.File;
import java.io.FileWriter;
public class FileWriterExample{
    public static void main(String[] args) throws Exception {
        File f = new File("sparsh.txt");
        System.out.println("File exists: " + f.exists());
        System.out.println("File name: " + f.getName());
        FileWriter fw = new FileWriter(f);
        fw.write("Hello, World!");
        fw.write("\nThis is a test file.");
        fw.close();
    }
}