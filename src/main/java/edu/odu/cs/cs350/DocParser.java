package edu.odu.cs.cs350;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class DocParser 
{

    

    public Document Parser() throws IOException{

        
        File fileFromPath = new File("");
        Document newDoc = Jsoup.parse(fileFromPath, "null");
        return newDoc;
    }

    /**
     * Extracts all anchor tags
     * 
     * 
     * @return a list of all anchor tags
     */

    public List <Element> extractAnchors() throws IOException{

        Document doc = Parser();
        Elements anchorTags = doc.select( "a[href]");
        List<Element> listAnchorTags = new ArrayList<>();
        
        for (Element e  : anchorTags){

            listAnchorTags.add(e);
        }
        

        return listAnchorTags;

    }

    /**
     * Extracts all image tags
     * 
     * 
     * @return a list of all image tags
     */
    
    public List <Element> extractImages() throws IOException{

        Document doc = Parser();
        Elements imageTags = doc.select("img[src]");
        List<Element> listImageTags = new ArrayList<>();

        for (Element e : imageTags){

            listImageTags.add(e);
        }
        

        return listImageTags;

    }

    /**
     * Extracts all link tags
     * 
     * 
     * @return a list of all link tags
     */

    public List <Element> extractLinks() throws IOException{

        Document doc = Parser();
        Elements linkTags = doc.select("link");
        List<Element> listLinkTags = new ArrayList<>();

        for (Element e : linkTags){

            listLinkTags.add(e);
        }
        

        return listLinkTags;

    }

    /**
     * Extracts all script tags
     * 
     * 
     * @return a list of all script tags
     */

    public List <Element> extractScripts() throws IOException{


        Document doc =  Parser();
        Elements scriptTags = doc.select("script");
        List<Element> listScriptTags = new ArrayList<>();
        
        for (Element e : scriptTags){

            listScriptTags.add(e);
        }
        

        return listScriptTags;

    }


    
    


}
   
    





    
