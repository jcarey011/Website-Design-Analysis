package edu.odu.cs.cs350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandLine {
    
    private static int numberOfFiles;
    private static String fileName;

    public CommandLine(){

    }
    /*
     * Function will access files and pull names
     */
    public static String getNames(){
        return fileName;
    }
    /*
     * Function will set private name
     * @param name  name to set 
     */
    public static void setName(String name)
    {
        fileName = name;
    }
    /*
     * Function will set number of files known
     * @param number  number to set private integer to
     */
    public static void setNumberFiles(int number)
    {
        numberOfFiles = number;
    }
    /*
    *   Function will access files and collect number of files in total
    *   @param numfiles  number of files found
    *   @return numFiles
    */
    public static int fetchNumberFiles()
    {
        return numberOfFiles;
    }
    /* 
     * Function will output file names to CLI
     * @param FileListSize  number of known files
     * @param 
    */
    public static void outPutFileNames(int FileListSize)
    {
        FileListSize = fetchNumberFiles();
        List<String> files = new ArrayList<>();
        files.add(getNames());
        for (int i = 0; i < FileListSize; i++)
        {
           files.forEach(System.out::println);
        }
    }
    
}
