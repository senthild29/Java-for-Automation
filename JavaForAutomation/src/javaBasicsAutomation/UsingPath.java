package javaBasicsAutomation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class UsingPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String FileLoc = "UsingPath.txt";
		String content = "Content of this file is written using Path class in Java";
		
		//Using Path class, getting file location
		Path getFile = Paths.get(FileLoc);
		
		//Using Files function getting the content of file as bytes and writing to file
		Files.write(getFile, content.getBytes());
		
		
	}

}
