import java.io.File;
public class FileWriterExample{
    public static void main(String args[]) throws IOException
    {
        File f = new File("abcd.txt");
        System.out.println(f.exists());
        FileWriter fw = new FileWriter(f);
        fw.write("Hello Programming");
        fw.flush();
    }
}

// FFlUSH METHOD