package javaBasicsAutomation;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Created a Variable to get the location of file
		String location = "UsingFileWriter.txt";
		
		//Created a variable to write the content into the file
		String content = "The content of this file is written using File Writer class in Java";
		
		//Created object using FileWriter class to get the location of file
		FileWriter getFile = new FileWriter(location);
		
		//Writing the content using Write function 
		getFile.write(content);
		getFile.close();

	}

}
