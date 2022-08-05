package edu.odu.cs.cs350;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestScript {
    
    @Test
    public void testClassification()
    {
        List <String> scriptTags = new ArrayList<>();
        List<String> internalScripts = new ArrayList<>();
        List<String> externalScripts = new ArrayList<>();



        for(String e: scriptTags)
        {
            if(e == "internal")
            {
                internalScripts.add(e);
            }

            else
            externalScripts.add(e);
        }
    }
}
