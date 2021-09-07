package javaBasicsAutomation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String FileLoc = "UsingFileOutPutSteam.txt";
		String content = "Content of this file is written using FileOutputStream class in Java";
		
		//Created new object for FileOutput Stream
		FileOutputStream getFile = new FileOutputStream(FileLoc);
		
		//Getting the contents of the file as bytes using getBytes() function and writing the content into file.
		getFile.write(content.getBytes());
		getFile.close();
	}

}
