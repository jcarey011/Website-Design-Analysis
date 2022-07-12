package src.main.java;
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
    public static String fetchFileNames(String[] FileList)
    {
        
    }
    //Function will access files and collect number of files in total
    public static String fetchNumberFiles(int numFiles)
    {

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
