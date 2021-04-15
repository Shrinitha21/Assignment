package testcase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FILEAPPEND {
	 public static void main(String[] args)
		        throws Exception
		    {
		       
		        String str = "                     Iam appending this line to end of the file.";
		        appendStrToFile("Demo.txt", str);
		  
		        // Let us print modified file
		        try {
		            BufferedReader in = new BufferedReader(
		                        new FileReader("Demo.txt"));
		  
		            String mystring;
		            while ((mystring = in.readLine()) != null) {
		                System.out.println(mystring);
		            }
		        }
		        catch (IOException e) {
		            System.out.println("Exception Occurred" + e);
		        }
		    }

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

