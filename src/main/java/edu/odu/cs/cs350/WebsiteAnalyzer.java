package edu.odu.cs.cs350;
import java.util.*;

//import org.apache.xmlbeans.impl.soap.Text;
//import org.ini4j.Options;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WebsiteAnalyzer {
    public static LinkedList<String> PathsList;

        public static void main(String[] args) throws IOException{
        
        
        String p = CommandLine.inputPath(); 
        

        Path pathToExamine = Paths.get(p);

        Website web = new Website(pathToExamine);
        web.examineDirectory();
    
        ExcelWriter.createExcel();
        JsonWriter.CreateJson();
        TextWriter.main();

        CommandLine.outputFileNames();
    }

}
