package jsonFileReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWriteExample {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a object for JSON using JSON-simple libraries
			JSONObject jsonobj = new JSONObject();
		
			//Add key and Values to object using put() function
		jsonobj.put("Name", "John");
		jsonobj.put("LastName", "Smith");
				
		//Create an JSON array using JSON-simple libraries
		JSONArray ArryObj = new JSONArray();
		
		//Add data to arrays
		ArryObj.add("IT Professional");
		ArryObj.add("10 Years");
		
		//Add values stored in array to json object
		jsonobj.put("Work", ArryObj);
		
		//Created object to write the JSON to file using Buffered Writer
		
		FileWriter File = new FileWriter("File.json");
		BufferedWriter BuffFile = new BufferedWriter(File);
		
		//If we use write () method to write the JSON Data to file,it will throw an error
		//hence we have used objectname.toString() or objectname.toJSONString() 
		BuffFile.write(jsonobj.toJSONString());
		BuffFile.close();		

	}

}
