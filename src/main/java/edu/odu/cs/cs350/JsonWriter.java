
package edu.odu.cs.cs350;

//import statements required

public class JsonWriter {
    public static void main(String[] args) {
    	 JSONObject jsonOutput  = new JSONObject();
    	 jsonOutput.put("basepath", "/path/to/local/copy");
    	 
    	 JSONArray jsonUrlArray = new JSONArray();
    	 jsonUrlArray.add("http://www.url1.com");
    	 jsonUrlArray.add("https://www.url2.com");
    	 jsonOutput.put("urls", jsonUrlArray);
    	 
    	 JSONArray jsonPagesArray = new JSONArray();
    	 jsonPagesArray.add("path", "./some/path/to/file1.html");
    	 
    	 JSONArray jsonImageCountArray = new JSONArray();
    	 jsonImageCountArray.add("local", "5");
    	 jsonImageCountArray.add("external", "2");
    	 jsonPagesArray.add("imageCount", jsonImageCountArray); 
    	 
    	 JSONArray jsonJSCountArray = new JSONArray();
    	 jsonImageCountArray.add("local", "12");
    	 jsonImageCountArray.add("external", "0");
    	 jsonPagesArray.add("jsCount", jsonJSCountArray);
    	 
    	 JSONArray jsonCSSCountArray = new JSONArray();
    	 jsonImageCountArray.add("local", "2");
    	 jsonImageCountArray.add("external", "1");
    	 jsonPagesArray.add("cssCount", jsonCSSCountArray);
    	 
    	 JSONArray jsonImagePathsArray = new JSONArray();
    	 jsonImagePathsArray.add("path/local/image1.svg");
    	 jsonImagePathsArray.add("https://upload.wikimedia.org/wikipedia/commons/2/24/LEGO_logo.svg");
    	 jsonPagesArray.add(jsonImagePathsArray);
    	 
    	 jsonPagesArray.add("scriptPaths", "path/to/local/script.js");
    	 
    	 jsonPagesArray.add("cssPaths", "someLocalStyle.css");
    	 
    	 JSONArray jsonLinkCountArray = new JSONArray();
    	 jsonLinkCountArray.add("intra-page", "5");
    	 jsonLinkCountArray.add("intra-site", "2");
    	 jsonLinkCountArray.add("external", "1");
    	 jsonPagesArray.add("linkCount", jsonLinkCountArray);
    	 
    	 jsonOutput.put("pages", jsonPagesArray);
    	 
    	 //Needs to be able to accept varying data for x number of images. Currently strictly 2. for (# of images){ create JSON object with specific data for those images}
    	 
    	 JSONArray jsonImagesArray = new JSONArray();
    	 	jsonImagesArray.add("path/to/image/1.jpg\", \"pageCount\": 2, \"usedOn\": [\"page1.htm\", \"page2.htm");
    	 	jsonImagesArray.add("path\": \"path/to/some/other/image.png\", \"pageCount\": 1, \"usedOn\": [\"page3.htm");
	 	 jsonOutput.put("images", jsonImagesArray);
	 	 
	 	JSONArray jsonImagesArray = new JSONArray();
 	 	jsonImagesArray.add("path/to/image/1.jpg\", \"pageCount\": 2, \"usedOn\": [\"page1.htm\", \"page2.htm");
 	 	jsonImagesArray.add("path\": \"path/to/some/other/image.png\", \"pageCount\": 1, \"usedOn\": [\"page3.htm");
	 	jsonOutput.put("images", jsonImagesArray);
	 	
	 	JSONArray jsonFilesArray = new JSONArray();
	 	
	 		JSONArray jsonArchiveArray = new JSONArray();
	 		jsonArchiveArray.add("path/to/image/1.jpg\", \"pageCount\": 2, \"usedOn\": [\"page1.htm\", \"page2.htm");
	 		jsonArchiveArray.add("path\": \"path/to/some/other/image.png\", \"pageCount\": 1, \"usedOn\": [\"page3.htm");
	 		jsonFilesArray.add("archive", jsonArchiveArray);
	 		
	 		JSONArray jsonVideoArray = new JSONArray();
	 		jsonVideoArray.add("path\": \"files/archive1.zip\", \"size\": \"2 MiB");
	 		jsonVideoArray.add("path\": \"files/potatoVideo.avi\", \"size\": \"8.4 MiB");
	 		jsonFilesArray.add("video", jsonVideoArray);
	 		
	 		JSONArray jsonAudioArray = new JSONArray();
	 		jsonAudioArray.add("path\": \"audioFile7.flac\", \"size\": \"10.2 MiB");
	 		jsonAudioArray.add("path\": \"files/audio3.mp3\", \"size\": \"0.5 MiB");
	 		jsonAudioArray.add("path\": \"files/audio1.wav\", \"size\": \"100.3 MiB");
	 		jsonFilesArray.add("audio", jsonAudioArray);
	 		
	 		JSONArray jsonOtherArray = new JSONArray();
	 		jsonOtherArray.add("path\": \"files/test.cpp\", \"size\": \"0.05 MiB");
	 		jsonFilesArray.add("other", jsonOtherArray);
 		
 		jsonOutput.put("files", jsonFilesArray);
 		
 		
    	 
    }
}



/*
 * Still To-Do:
 * -Import Statements
 * -Add Detailed Comments for readability
 * -Write to File
 * -Skeleton currently strictly outputs example data, not prepared to handle input
 * -Rename class (conflicts)
 * 
 */


