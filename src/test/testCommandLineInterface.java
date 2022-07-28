package src.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert;
import org.junit.Test;
import src.main.java.CommandLine;

public class testCommandLineInterface {
    
    @test
    public void testCLIFetchNumber()
    {
        int numberOfFiles = 4;
        fetchNumberFiles(numberOfFiles);
        assertEquals(fetchNumberFiles, 4);
    }
    public void testCLIOutput()
    {

    }
}
