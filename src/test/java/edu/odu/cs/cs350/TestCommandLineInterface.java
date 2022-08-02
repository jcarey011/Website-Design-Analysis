package edu.odu.cs.cs350;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import edu.odu.cs.cs350.CommandLine;


public class TestCommandLineInterface {
    
    @Test
    public static void testAddFunction()
    {
        String fileName = "Hannibal.txt";
        CommandLine.addNames(fileName);
        assertThat(CommandLine.fileList, containsString("Hannibal.txt"));
    }
    @Test
    public static void testGetNames()
    {
        CommandLine.addNamesaddNames("Testname");
        CommandLine.getNames();
        assertThat(CommandLine.getNames(), containsString("Testname"));
    }
    @Test
    public static void testFetchFunction()
    {
        CommandLine.setNumberFiles(12);
        CommandLine.fetchNumberFiles();
        assertEquals(12, CommandLine.fetchNumberFiles());
    }

}

