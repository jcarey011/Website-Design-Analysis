package edu.odu.cs.cs350;
import java.io.File;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class TextWriter
{
    public static void main(String [] directories)
    {

    //string array with fake directory data and int array with fake image size data
    String[] directory = {"/Rainbow", "/Reindeer", "/Apple", "/Zebra", "/Unicorn", "/Test"};
    int[] sizes = {125, 657, 27, 195, 206, 987};
    //calling method to sort directory names lexicographically
    sortingDirectories(directory);

    
    int i=0;
    int total=0;
    String name= FileName();
    //creating txt file 
    try{
        File file = new File (name);
        PrintStream fileStream = new PrintStream(file);
        System.setOut(fileStream);
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
   
    //printing out to newly created txt file
    for(String string : directory)
    {
        System.out.print(sizes[i] + " ");
        System.out.println("." + string);
        total=sizes[i]+total;
        i++;
    }
    System.out.println(total); 
}


/**
 * Sorts directory names lexicographically
 * @param directories which is the list of directories
 * @return directories which would be the now sorted list of directories
 */

public static String[] sortingDirectories(String[] directories)
{
    for (int i=0; i<directories.length; i++){
        for(int j=i+1; j<directories.length; j++){
            if(directories[i].compareToIgnoreCase(directories[j])>0){
                String temp = directories[i];
                directories[i]=directories[j];
                directories[j]=temp;
            }
        }
    }
    return directories;
}


/**
 * Creates filename based on the date and time
 * @return the date and time to name the file + summary as an appendage
 */
public static String FileName(){

    LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String formattedTime = formatter.format(today);

        return formattedTime + "-summary.txt";
}

}

