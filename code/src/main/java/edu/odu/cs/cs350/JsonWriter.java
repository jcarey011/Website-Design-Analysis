/**
 * This class creates and outputs a json file
 */
package edu.odu.cs.cs350;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.JSONParser;



public class JsonWriter {
    /**
     * Produces file name for json file to be created)
     * @return string name for json output
     */
	public static String produceFileName(){

		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
		String formattedTime = formatter.format(today);

		return formattedTime + "-summary.json";
	}
    /**
     * Creates and outputs json file
     * @return json file
     * @param json object
     * @throws IOException
     */
	public static void CreateJson() {
		
		JSONObject jObject  = new JSONObject();
		jObject.put("Images", "Image Information");

		try {
			FileWriter file = new FileWriter(produceFileName());
			file.write(jObject.toJSONString());
			file.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}