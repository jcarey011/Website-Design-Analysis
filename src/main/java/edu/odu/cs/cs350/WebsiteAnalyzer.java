package edu.odu.cs.cs350;
import java.util.*;

import org.apache.xmlbeans.impl.soap.Text;
//import org.ini4j.Options;

import java.io.*;
import java.nio.file.Path;


public class WebsiteAnalyzer {
    
public static void main(String args[]) throws IOException{
    String textFileName;
    String jsonFileName;
    String ExcelFileName;
    String Path;

    Website web = new Website(args);
    Options userOptions = web.getOptions();
    Path = CommandLine.inputPath();
    Options op = new Options(Path);
    

    Path = CommandLine.inputPath();
    
    

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
