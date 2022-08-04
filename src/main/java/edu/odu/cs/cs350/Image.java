package edu.odu.cs.cs350;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.*;

public class Image {
	
	public long bytes;
	public Path imgPath;  
    
	public void Files(Path path) {
		this.imgPath = path;
	}
	
    public List<Image> extractImageData(Path path){
    	Website web = new Website(path);
    	// Files f = new Files(path);
    	List<Image> listImages = new ArrayList<>();
    	for (Path e: web.getFileList()) {
    		
    		// algorithm to record listImages.bytes & listImages.imgPath
    		
    	}
    	return listImages;
    
    }
}
