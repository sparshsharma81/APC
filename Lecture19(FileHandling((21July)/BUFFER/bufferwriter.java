// package APC.Lecture19(FileHandling((21July).BUFFER;

import java.io.*;
import java.util.*;
public class bufferwriter {
    public static void main(String[] args){
        File f = new File("bufferedWriter.txt");
        try {
            // Create a FileWriter in append mode
            FileWriter fw = new FileWriter(f, true); //ye hai append mode 
            // Create a BufferedWriter to write text to the file
            BufferedWriter bw = new BufferedWriter(fw);


            //if we want to do operations using bufferreader and bufferwriter..then there is an intermideate medium...
            //basically there is a intermedidate medium between filewriter and bufferedwriter
            
            // Write some lines to the file
            bw.write("This is the first line.\n");
            bw.write("This is the second line.\n");
            bw.write("Writing another line\n");
            
            // Flush and close the BufferedWriter
            bw.flush();
            bw.close();
            //FileReader and FileWriter they are intermediatre
            //now if we want to read 
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            //bufferreader has read and readLine() two methods
            ///readLine method is not present in filereader 
            /// //read method is used to read a single character from the file 
            // ab basically ham character ki thrah hi read karege...
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line read from the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
