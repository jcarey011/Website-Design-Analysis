package edu.odu.cs.cs350;
public class CommandLine {
    
    public void main(String args[])
    {
        //Example File List
        String[] fileList = {"test.txt", "test.xlxs", "test.json"};
        //Example File Size 
        int FileListSize = 3;
        outPutFileNames(fileList, FileListSize);
    }
    //Function will access files and pull names
    public static String[] fetchFileNames(String[] FileList)
    {
        return FileList;
    }
    //Function will access files and collect number of files in total
    public static int fetchNumberFiles(int numFiles)
    {
        return numFiles;
    }
    //Function will output file names to CLI
    public static void outPutFileNames(String[] FileList, int FileListSize)
    {
        for (int i = 0; i < FileListSize; i++)
        {
            System.out.println(FileList);
        }
    }
    
}
