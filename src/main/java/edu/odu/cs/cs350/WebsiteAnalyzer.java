package edu.odu.cs.cs350;
import java.util.*;
import java.io.*;


public class WebsiteAnalyzer {
    
public static void main(String args[]){
    Website web = new Website(args);
        Options userOptions = web.getOptions();
        //List<*insert code*> html = new ArrayList<>();

        for(File file : web.getSourceFiles()){
            println(web);
           // *docparser* code = new *docparser*(file);
          //  code.add(code);
        }

    
    CommandLine.setNumberFiles(CommandLine.fetchNumberFiles());
    CommandLine.outPutFileNames(CommandLine.fetchNumberFiles());
}

}
