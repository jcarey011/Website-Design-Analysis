package edu.odu.cs.cs350;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.JSONParser;



public class JsonWriter {	
	public static void main(String args[]) {
		JSONObject jObject  = new JSONObject();
		jObject.put("Test", "This is a Test");

		try {
			FileWriter file = new FileWriter("test.json");
			file.write(jObject.toJSONString());
			file.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}