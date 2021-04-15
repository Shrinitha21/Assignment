package testcase;

import java.io.*;

public class ENDOFFILE {
  
    public static void appendStrToFile(String fileName,
                          String str)
    {
        try {
  
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                   new FileWriter("Demo.txt", true));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}