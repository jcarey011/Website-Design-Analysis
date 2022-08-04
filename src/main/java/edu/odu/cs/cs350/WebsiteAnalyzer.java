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
        String textFileName;
        String jsonFileName;
        String ExcelFileName;
        
        

    

        Path pathToExamine = Paths.get(args [0]);
        System.out.println(pathToExamine);

        Website web = new Website(pathToExamine);
        web.examineDirectory();

        System.out.println("Files Identified:");

        for(Path file: web.getFileList()){
            System.out.format(" - %s%n", file);
        }

        System.out.println();

        System.out.println("Directories Identified:");
        for(Path file : web.getDirectoryList()){
            System.out.format(" - %s%n", file);
        }

        ExcelWriter.createExcel();
        

    
        ExcelWriter.createExcel();
        JsonWriter.CreateJson();
        TextWriter.main();

        ExcelFileName = ExcelWriter.produceFileName();
        jsonFileName = JsonWriter.produceFileName();
        textFileName = TextWriter.FileName();

        CommandLine.addNames(ExcelFileName);
        CommandLine.addNames(jsonFileName);
        CommandLine.addNames(textFileName);
            
        CommandLine.setNumberFiles(3);
        CommandLine.outPutFileNames(CommandLine.fetchNumberFiles());

        
    }

}
