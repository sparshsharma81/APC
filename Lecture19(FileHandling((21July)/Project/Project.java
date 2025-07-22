import java.io.*;
import java.util.*;
public class Project{
    public static void main(String args[]) throws IOException 
    {
        File f = new File("Project.txt");
        f.mkdir(); // Creating a directory named Project....
        File f1 = new File("Project-file.txt");
        f1.createNewFile(); // Create a new file named Project.txt

        // To append data, use FileWriter(file, true) - the 'true' parameter enables append mode
        FileWriter fw = new FileWriter(f1, true);  //ye basically append mode me file open krega..
        //now we can read and write in this file
        
        fw.write("This is the first line.\n");
        fw.write("This is the second line.\n");
        fw.write("Writing another line\n"); //this will append, not override 
        //fw.write(100) -- if we write this in fw.write() ,,then write manual method will convert it into string 

        fw.flush(); //ye basically flush krege... 
        // flush() method is used to clear the buffer and write the data to the file immediately.
        // It ensures that all data is written to the file before closing it.

        FileReader fr = new FileReader(f1); //ye basically file read krega... 
        //read method is used to read a character from the file.
        //just one character 
        System.out.println(fr.read()); //this will read the first character from the file
        //if we want to read one character from a file..then we use filereader 
        //it will read one character at a time  //like it will read the first character and return its ascii value 

        System.out.println((char)fr.read()); //this will read the first character from the file and convert it to char
        //it is basically typecast 



        /*
         * 
         Filereader -- ye basically ek character ko read karke uski ascii value ko return kardega
         jabtak file me ascii characters present hai tabtak read karega..file -1 return kar dega
         */
        FileReader fr2 = new FileReader(f1);
        int ch;
        while ((ch = fr2.read()) != -1) { //ye basically file se character read karega
            System.out.print((char) ch); //ye character ko print karega
        }
        fw.close(); //ye basically close krege...
    }
}