package src.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

import src.main.java.TextWriter;

public class testWriterSortingTest 
{
    
    public String[] test= {"Xylophone", "Apple", "Acorn", "Barn", "Barn"};
    @Test
    public void testWriterSort()
    {
        TextWriter.sortingDirectories(test);
        assertArrayEquals(new String[] {"Acorn","Apple","Barn","Barn","Xylophone"}, test);
    }
    
}
