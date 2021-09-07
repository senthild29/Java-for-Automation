package javaBasicsAutomation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Created variable to store the file location
		String FileLoc = "UsingBufferedWriter.txt";

		//Using FileReader created new object to readh the file
		FileReader readFile = new FileReader(FileLoc);

		//Created new object UsingBufferedReader and assigning the variable of FileReader 
		BufferedReader readBufferFile = new BufferedReader(readFile);

		//To read multiple lines in a file
		String readFileContent;

		while((readFileContent=readBufferFile.readLine())!=null) {
			System.out.println(readFileContent);
		}
		


	}

}
