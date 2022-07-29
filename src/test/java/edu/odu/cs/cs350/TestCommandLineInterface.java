package edu.odu.cs.cs350;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

import edu.odu.cs.cs350.CommandLine;


public class TestCommandLineInterface {
    
    @Test
    public static void testAddFunction()
    {
        String fileName = "Hannibal.txt";
        CommandLine.addNames(fileName);
        assertThat(CommandLine.fileList, contains("Hannibal.txt"));
    }
}
