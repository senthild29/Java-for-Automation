package javaBasicsAutomation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String FileLoc = "UsingBufferedWriter.txt";
		String content = "The content of this file is written using Buffered File Write class in Java";
		
		FileWriter getFile = new FileWriter(FileLoc);
		
		//Created object for BufferedWriter to write the content in buffer file instead of actual file
		BufferedWriter buffergetFile = new BufferedWriter(getFile);
		buffergetFile.write(content);
		buffergetFile.close();
		
	}

}
