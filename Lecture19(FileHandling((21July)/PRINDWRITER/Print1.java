// package APC.Lecture19(FileHandling((21July).PRINDWRITER;

import java.io.*;
import java.util.*;
public class Print1 {
    public static void main(String args[]){
        File f = new File("print.txt");
        try {
            // Create a FileWriter in append mode
            FileWriter fw = new FileWriter(f, true); //ye hai append mode 
            // Create a PrintWriter to write text to the file
            PrintWriter pw = new PrintWriter(fw);

            // Write some lines to the file
            pw.println("This is the first line.");
            pw.println("This is the second line.");
            pw.println("Writing another line");

            // Flush and close the PrintWriter
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
