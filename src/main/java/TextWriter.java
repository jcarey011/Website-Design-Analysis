package src.main.java;


public class TextWriter
{
    public static void main(String [] directories)
    {

    //string array with fake directory data 
    String[] directory = {"Rainbow", "Reindeer", "Apple", "Zebra", "Unicorn", "Test"};
    
    //calling method to sort directory names lexicographically
    sortingDirectories(directory);

    //printing to commandline output to visualize/test
    for(String string : directory)
        System.out.print(string + " ");
    System.out.println();

}
//method to lexicographically sort directory names
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
}


