/* USING LIVE WEBSITE COPY AS A TEST */

package edu.odu.cs.cs350;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class DocParser {

    public static void inputURL() throws IOException
{   
    
    //File input = new File("example/test.html");

    Document newDoc = Jsoup.connect("https://www.cnn.com/").get();


    Elements anchorTags = newDoc.select( "a[href]");
    Elements imageTags = newDoc.select("img[src]");
    Elements linkTags = newDoc.select("[link]");
    Elements scriptTags = newDoc.select("[script]");

    int numAnchorTags = anchorTags.size();
    int numImageTags = imageTags.size();
    int numLinkTags = linkTags.size();
    int numScriptTags = scriptTags.size();

    System.out.println(numAnchorTags);
    System.out.println(anchorTags);

    System.out.println(numImageTags);
    System.out.println(imageTags);

    System.out.println(numLinkTags);
    System.out.println(linkTags);

    System.out.println(numScriptTags);
    System.out.println(scriptTags);
    
}

public static void main(String[] args) throws IOException {

    inputURL();
    Website website = new Website(args);
    Options userOptions = website.getOptions();
}
    
}
