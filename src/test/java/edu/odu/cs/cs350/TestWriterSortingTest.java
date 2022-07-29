package edu.odu.cs.cs350;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
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
    
}
