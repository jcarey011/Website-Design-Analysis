package edu.odu.cs.cs350;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TestStyleSheet {
    
    @Test
    public void testClassification()
    {
        List <String> linkTags = new ArrayList<>();
        List<String> internalLinks = new ArrayList<>();
        List<String> externalLinks = new ArrayList<>();



        for(String e: linkTags)
        {
            if(e == "internal")
            {
                internalLinks.add(e);
            }

            else
            externalLinks.add(e);
        }
    }
}
