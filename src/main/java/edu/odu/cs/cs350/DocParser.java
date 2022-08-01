package edu.odu.cs.cs350;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


import javax.swing.text.html.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class DocParser 
{

    

    public Document Parser() throws IOException{

        //HTMLDocument document = new HTMLDocument(filePath);
        File fileFromPath = new File("");
        Document newDoc = Jsoup.parse(fileFromPath, "null");
        return newDoc;
    }

     /*private String absFilePath;
    private List <Tag> tags;
    private int numTags;

    public DocParser(){
        this.absFilePath = "";
        this.tags = new ArrayList<>();
        this.numTags = 0;
        
    }

    public DocParser(File file) throws IOException{
        this.absFilePath = findAbsFilePath(file);
        this.tags = Tag(file);
        this.numTags = this.tags.size();
    }

    public void setAbsFilePath(String filePath){
        this.absFilePath = filePath;
    }

    public void setTags(List<Tag> tags){
        this.tags = tags;
    }

    public void setNumTags(int n){
        this.numTags = n;
    }

    public String getAbsFilePath(){
        return this.absFilePath;
    }

    public List<Tag> getTags(){
        return this.tags;
    }

    public int getNumTags(){
        return this.numTags;
    }

    public String toString(){
        String out = String.format("    %s, %d", this.absFilePath, this.numTags);
        return out;
    }

    private String findAbsFilePath(File file){
        String a = file.getAbsolutePath();
        return a;
    }

    public List<Tag> Tag(File file) throws IOException{
    String filePath = file.getAbsolutePath();
    
    ///Store these in the list and then print out the list

    Document newDoc = Jsoup.parse(filePath);
    
    }
    */

    /**
     * Extracts all anchor tags
     * 
     * @param the parsed html file
     * 
     * @return a list of all anchor tags
     */

    public List <Elements> extractAnchors(Document doc) throws IOException{

        doc = Parser();
        Elements anchorTags = doc.select( "a[href]");
        List<Elements> listAnchorTags = new ArrayList<Elements>();
        
        for (Elements e  : new ArrayList<Elements>(listAnchorTags)){

            listAnchorTags.add(anchorTags);
        }
        

        return listAnchorTags;

    }

    /**
     * Extracts all image tags
     * 
     * @param the parsed html file
     * 
     * @return a list of all image tags
     */
    
    public List <Elements> extractImages(Document doc) throws IOException{

        doc = Parser();
        Elements imageTags = doc.select("img[src]");
        List<Elements> listImageTags = new ArrayList<Elements>();

        for (Elements e : new ArrayList<Elements>(listImageTags)){

            listImageTags.add(imageTags);
        }
        

        return listImageTags;

    }

    /**
     * Extracts all link tags
     * 
     * @param the parsed html file
     * 
     * @return a list of all link tags
     */

    public List <Elements> extractLinks(Document doc) throws IOException{

        doc = Parser();
        Elements linkTags = doc.select("link");
        List<Elements> listLinkTags = new ArrayList<Elements>();

        for (Elements e : new ArrayList<Elements>(listLinkTags)){

            listLinkTags.add(linkTags);
        }
        

        return listLinkTags;

    }

    /**
     * Extracts all script tags
     * 
     * @param the parsed html file
     * 
     * @return a list of all script tags
     */

    public List <Elements> extractScripts(Document doc) throws IOException{


         doc =  Parser();
        Elements scriptTags = doc.select("script");
        List<Elements> listScriptTags = new ArrayList<Elements>();
        
        for (Elements e : new ArrayList<Elements>(listScriptTags)){

            listScriptTags.add(scriptTags);
        }
        

        return listScriptTags;

    }


    
    


}
   
    





    
