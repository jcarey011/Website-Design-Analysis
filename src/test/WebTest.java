package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WebTest{
    @Test void testConstructor(){
        String [] thingy = new String[]{"1", "settings.ini", "src/test/data/outline.html", "src/test/data/foo.cpp"};
        List<File> files = new ArrayList<>();
        File f1 = new File("src/test/data/outline.html");
        File f2 = new File("src/test/data/foo.cpp");
        files.add(f1);
        files.add(f2);

        WebTest a = new WebTest(thingy);
        assertEquals(files,a.getSourceFiles());
    }

    @Test void testFindFilesInDir(){
        String path = "src/test/data/";
        File dir = new File(path);
        WebTest input = new Webtest();
        Options options = new Options();
        List<File> files = input.findFilesInDir(dir, options);

        assertEquals(5, files.size());
    }
}