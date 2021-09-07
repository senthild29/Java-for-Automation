package jsonFileReadWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReadExample {

	public static void main(String[] args) throws IOException, ParseException{

		//Create object for JSONParser
		JSONParser jsnparser = new JSONParser();

		
		//Create object to get the JSON file
		FileReader ReadFile = new FileReader("File.json");

		//Parse the file data using parse() and store in a Parent Object
		Object ParsedData = 	jsnparser.parse(ReadFile);

		//Convert the data Parent Object to JSON Object by type casting
		JSONObject jsnObj = (JSONObject) ParsedData;

		//Using get() read the key values from file and store it in a String/Long based on the data type
		String name =   (String) jsnObj.get("Name");

		String LastName = (String) jsnObj.get("LastName");

		//Print the data stored in variables
		System.out.println("Name is : "+name);
		System.out.println("LastName is : "+LastName);

		//Using get() read the key values and store it in a JSONArray
		JSONArray jsonArry = (JSONArray) jsnObj.get("Work");

		//Using iterator() iterate the data in while loop and print the same
		Iterator Iterate = 	jsonArry.iterator();
		while(Iterate.hasNext()) {
			System.out.println("Work Experience is : "+Iterate.next());
		}

	}

}
