package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.junit.jupiter.api.Test;

public class WebTest{
    @Test 
    public void testConstructor(){
        
        Path pathInput = Paths.get("src/test/data/Outline.html");
        List<Path> allFiles = new ArrayList<>();
        List<Path> allDirectories = new ArrayList<>();

        
        
        
        /*String [] thingy = new String[]{"1", "settings.ini", "src/test/data/Outline.html", "src/test/data/Outz.html"};
        List<File> files = new ArrayList<>();
        File f1 = new File("src/test/data/Outline.html");
        File f2 = new File("src/test/data/Outz.html"); 
        files.add(f1);
        files.add(f2);

        Website a = new Website(thingy);
        assertEquals(files,a.getSourceFiles());*/
    }

    @Test
    public void testExamineDirectory(){

        
    }
    @Test
    public void testGetFileList(){
        List<Path> allFiles = new ArrayList<>();
        List<Path> allDirectories = new ArrayList<>();
        
    
    }
    @Test
    public void testGetDirectoryList()
    {
        List<Path> allDirectories = new ArrayList<>();
        Path p1 = Paths.get("C:", "documents", "tests");
        allDirectories.add(p1);
        Website w = new Website(p1);
        String Directory;
        
        Directory = w.getDirectoryList().toString();
        assertThat(Directory, containsString("C:"));
    }

   /*  @Test void testFindFilesInDir(){
        String path = "src/test/data/";
        File dir = new File(path);
        Website input = new Website();
        Options options = new Options();
        List<File> files = input.findFilesInDir(dir, options);

        //assertEquals(5, files.size());
    }
    */
}
