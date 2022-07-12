package edu.odu.cs.cs350;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ini4j.Wini;

public class Options {
    private List<String> validExts;
    private int smallestSeq;
    private int maxFuncParams;

    public Options(){
        this.validExts = new ArrayList<>(Arrays.asList("html", "htm"));
        this.smallestSeq = 10;
        this.maxFuncParams = 8;
    }

    public Options(String confPath){
        readConfigFile(confPath);
    }

    public void setValidExts(List<String> exts){
        this.validExts = exts;
    }

    public void setSmallestSeq(int n){
        this.smallestSeq = n;
    }

    public void setMaxFuncParams(int max){
        this.maxFuncParams = max;
    }

    public int getSmallestSeq(){
        return this.smallestSeq;
    }

    public int getMaxFuncParams(){
        return this.maxFuncParams;
    }

    public List<String> getValidExts(){
        return this.validExts;
    }

    private void readConfigFile(String confPath){

        Wini configuration = null;
        try {
             configuration = new Wini(new File(confPath));
        } catch(Exception e) {
            e.printStackTrace();
        }

        this.validExts = Arrays.asList("html", "htm");
        this.smallestSeq = 10;
        this.maxFuncParams = 8;

        if(configuration != null) {
            String extensions = configuration.get("settings", "extensions");
            if(extensions == null) {
                return;
            }

            this.validExts = Arrays.asList(extensions.split(","));
        }
    }
}
