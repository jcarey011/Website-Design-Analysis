package edu.odu.cs.cs350;
import java.util.*;

import org.apache.xmlbeans.impl.soap.Text;

import java.io.*;


public class WebsiteAnalyzer {
    
public static void main(String args[]){
    String textFileName;
    String jsonFileName;
    String ExcelFileName;

    Website web = new Website(args);
        Options userOptions = web.getOptions();
        //List<*insert code*> html = new ArrayList<>();

        for(File file : web.getSourceFiles()){
            println(web);
           // *docparser* code = new *docparser*(file);
          //  code.add(code);
        }
    ExcelWriter.createExcel();
    JsonWriter.CreateJson();
    TextWriter.main(directories);

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
