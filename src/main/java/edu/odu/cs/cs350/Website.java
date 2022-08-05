package edu.odu.cs.cs350;

//import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;

/**
 * Collects list of files and directories for the directory that was inputted
 */


public class Website {
    
    Path pathInput;

    List<Path> allFiles;
    List<Path> allDirectories;
/**
 * Records all the directories and files
 * 
 * *param path to be analyzed
 */
    public Website(Path path){

        this.pathInput = path;

        this.allFiles = new ArrayList<>();
        this.allDirectories = new ArrayList<>();

    }
   
/**
 * Examines the directory
 * 
 * @throws IOException if directory cannot be read
 * 
 */
    public void examineDirectory() throws IOException{

        Files.walk(this.pathInput).forEach((Path path) -> {

            if(Files.isRegularFile(path)){
                
                this.allFiles.add(path);

            }
            else if (Files.isDirectory(path)){

                this.allDirectories.add(path);
            }
        });
    }
/**
 * 
 * Retrive list of identified files
 */
    public List<Path> getFileList(){

        return this.allFiles;
    }
/**
 * 
 * Retrieve list of identified directories
 *  
*/    

    public List<Path> getDirectoryList(){

        return this.allDirectories;
    }
}
