// // File: FileWriterExample.java

import java.io.File;  //ye basically imports the File class 
import java.io.FileWriter; //ye imports the FileWriter class
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args)throws IOException {
        File f = new File("test1.txt");
        System.out.println("File exists: " + f.exists());
        System.out.println("File name: " + f.getName());
        
        // Using try-with-resources to ensure proper file closing
        try (FileWriter fw = new FileWriter(f)) {
            fw.write("Hello, World!// this is testing...");
            fw.write("\nThis is a test file."); 
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
