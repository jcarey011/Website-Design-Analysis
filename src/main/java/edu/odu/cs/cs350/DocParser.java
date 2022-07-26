/* USING LIVE WEBSITE COPY AS A TEST */

package edu.odu.cs.cs350;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
public class DocParser 
{
    private String absFilePath;
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
     
    Document newDoc = Jsoup.parse(filePath);
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

    return .getTokens();
    }
}
  /*  
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
    */

public static void main(String[] args) throws IOException {

    Website website = new Website(args);
    Options userOptions = website.getOptions();
    for(File file : website.getSourceFiles()){
        DocParser doc = new DocParser(file);
    }


}

}
    
