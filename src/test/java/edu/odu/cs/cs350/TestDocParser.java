package edu.odu.cs.cs350;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class TestDocParser{

    @Test
    public void testAnchorExtractor()
    {
        Document testDoc = new Document("src/test/data/Outline.html");
        Elements anchorTags = testDoc.select( "a[href]");
        List<Elements> listAnchorTags = new ArrayList<Elements>();
        
        for (Elements e : new ArrayList<Elements>(listAnchorTags)){

            listAnchorTags.add(anchorTags);
        }
    }

    @Test
    public void testImageExtractor()
    {
        Document testDoc = new Document("src/test/data/Outline.html");
        Elements imageTags = testDoc.select( "img[src]");
        List<Elements> listImageTags = new ArrayList<Elements>();
        
        for (Elements e : new ArrayList<Elements>(listImageTags)){

            listImageTags.add(imageTags);
        }
    }

    @Test
    public void testLinkExtractor()
    {
        Document testDoc = new Document("src/test/data/Outline.html");
        Elements linkTags = testDoc.select( "link");
        List<Elements> listLinkTags = new ArrayList<Elements>();
        
        for (Elements e : new ArrayList<Elements>(listLinkTags)){

            listLinkTags.add(linkTags);
        }
    }

    @Test
    public void testScriptExtractor()
    {
        Document testDoc = new Document("src/test/data/Outline.html");
        Elements scriptTags = testDoc.select( "link");
        List<Elements> listScriptTags = new ArrayList<Elements>();
        
        for (Elements e : new ArrayList<Elements>(listScriptTags)){

            listScriptTags.add(scriptTags);
        }
    }


}