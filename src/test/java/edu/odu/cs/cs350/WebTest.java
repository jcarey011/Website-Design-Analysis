package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import static org.hamcrest.Matchers.is;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystems;


import org.junit.jupiter.api.Test;

public class WebTest{
    @Test 
    public void testConstructor(){
        
        Path pathInput = Paths.get("src/test/data/Outline.html");
        List<Path> allFiles = new ArrayList<>();
        List<Path> allDirectories = new ArrayList<>();

        
        
        
    }

    @Test
    public void testExamineDirectory(){

        
    }
    @Test
    public void testGetFileList(){
        Website w = new Website();
        Path p1 = Paths.get("C:", "documents", "tests", "test.html");
        w.allFiles.add(p1);
        List<Path> expected = w.allFiles;
        List<Path> actual = w.getFileList();
        assertThat(actual, is(expected));
    }
    @Test
    public void testGetDirectoryList()
    {
        Website w = new Website();
        Path p1 = Paths.get("C:", "documents", "tests");
        w.allDirectories.add(p1);
        List<Path> expected = w.allDirectories;
        List<Path> actual = w.getDirectoryList();
        assertThat(actual, is(expected));
    }

   
    
}
