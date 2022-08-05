package edu.odu.cs.cs350;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


public class TestWriterSortingTest 
{
    
    public String[] test= {"Xylophone", "Apple", "Acorn", "Barn", "Barn"};
    @Test
    public void testWriterSort()
    {
        TextWriter.sortingDirectories(test);
        assertArrayEquals(new String[] {"Acorn","Apple","Barn","Barn","Xylophone"}, test);
    }
	
    @Test
	public void testTextFileName()
	{
		String testpat = TextWriter.FileName();
		assertTrue(testpat.matches("\\d{8}-\\d{6}-summary.txt"));
	}
}
