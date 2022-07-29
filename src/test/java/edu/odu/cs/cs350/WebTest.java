package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WebTest{
    @Test void testConstructor(){
        String [] thingy = new String[]{"1", "settings.ini", "src/test/data/Outline.html", "src/test/data/Outz.html"};
        List<File> files = new ArrayList<>();
        File f1 = new File("src/test/data/Outline.html");
        File f2 = new File("src/test/data/Outz.html"); 
        files.add(f1);
        files.add(f2);

        Website a = new Website(thingy);
        assertEquals(files,a.getSourceFiles());
    }

    @Test void testFindFilesInDir(){
        String path = "src/test/data/";
        File dir = new File(path);
        Website input = new Website();
        Options options = new Options();
        List<File> files = input.findFilesInDir(dir, options);

        assertEquals(5, files.size());
    }
}
