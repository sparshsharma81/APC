// package APC.Lecture18(FileOperations)(18july);
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String args[]) throws IOException{
        //exception is not handled...it just delicate the method 
        File f = new File("abc.txt");
        System.out.println(f.exists());
        //there is IOexception --- it is check exception 
        //we should handle this exception 
        //we can use throws in the main to avoid exception 
        f.createNewFile();
        
        File f2 = new File("Java");
        f2.mkdir();
        f2.createNewFile();
        File f3 = new File(f2,"java.txt");
        f3.createNewFile();
        System.out.println(f3.getAbsolutePath());
    }
}
