package edu.odu.cs.cs350;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;

public class TestCommandLineInterface {
    
    @Test
    public static void testAddFunction()
    {
        CommandLine c = new CommandLine();
        c.addNames("Hannibal.txt");
        assertThat(c.fileList, contains("Hannibal.txt"));
    }
    @Test
    public static void testGetNames()
    {
        CommandLine c = new CommandLine();
        c.fileName = "Hannibal.txt";
        String actual = CommandLine.getNames();
        String expected = "Hannibal.txt";
        assertThat(actual, is(expected));
    }
    @Test
    public static void testFetchFunction()
    {

    }

}

