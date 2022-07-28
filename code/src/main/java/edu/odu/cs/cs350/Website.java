package edu.odu.cs.cs350;

import java.util.*;
import java.io.*;

public class Website {
    private Options options;
    private List<File> sourceFiles;

    public Website(){
        this.options = new Options();
        this.sourceFiles = new ArrayList<>();
    }

    public Website(String [] args){
        this.options = findOptions(args);
        this.sourceFiles = findSourceFiles(args, this.options);
    }

    public void setSourceFiles(List<File> files){
        this.sourceFiles = files;
    }

    public void setOptions(Options options){
        this.options = options;
    }

    public List<File> getSourceFiles(){
        return this.sourceFiles;
    }


    public Options getOptions(){
        return this.options;
    }


    private Options findOptions(String [] args){
        String path = args[1];
        Options options = new Options(path);
        return options;
    }

    /**
     * Returns a List of paths of valid files from the user paths passed into the
     * CLI
     *
     * @param args     String array of command line arguments
     * @param options   config containing list of valid file extensions
     *
     * @return         List of valid file paths
     */
    public List<File> findSourceFiles(String [] args, Options options){
        List<File> sourceFiles = new ArrayList<>();
        List<String> fileExts = options.getValidExts();

        for (String path : args) {
            File file = new File(path);
            if (file.isDirectory()) {
                List<File> filesFromDir = new ArrayList<>(findFilesInDir(file, options));
                sourceFiles.addAll(filesFromDir);
            }

            else if (file.exists()) {
                String ext = path.substring(path.lastIndexOf('.') + 1);
                if (fileExts.contains(ext)) {
                    sourceFiles.add(file);
                }
            }
        }
        return sourceFiles;
    }

    /**
     * Recursively searches a directory for valid files and adds them to a List
     *
     * @param  file     directory to be searched
     * @param options   config containing a list of valid file extensions
     *
     * @return         List of all valid files within the directory and subdirectories
     */
    public List<File> findFilesInDir(File file, Options options){
        List<File> files = new ArrayList<File>();
        List<String> fileExts = options.getValidExts();
        File [] filesInDIr = file.listFiles();

        for (File f : filesInDIr){

            if (f.isDirectory()){
                List<File> filesFromDir = new ArrayList<>();
                filesFromDir = findFilesInDir(f, options);
                if (filesFromDir.size() > 0){
                    files.addAll(filesFromDir);
                }
            }

            else if (f.isFile()){
                String path = f.getAbsolutePath();
                String ext = path.substring(path.lastIndexOf('.') + 1);
                if (fileExts.contains(ext)){
                    files.add(f);
                }
            }
        }
        return files;
    }
}
