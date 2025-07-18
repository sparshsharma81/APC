package APC.Lecture18(FileOperations)(18july);

public class FileExample {
    public static void main(String args[]){
        File f = new File("abc.txt");
        System.out.println(f.exists());
        //there is IOexception --- it is check exception 
        //we should handle this exception 
    }
}
