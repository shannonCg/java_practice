package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReader {

	public static void main(String[] args) {
		try{
			File file = new File("file.txt");
			
			//write data into file
			FileWriter fw = new FileWriter(file);
			fw.write("Hello World~\nHow are you?");
			fw.flush();
			fw.close();
			
			//read data from file
			FileReader fr = new FileReader(file);
			char[] in = new char[50];
			int size = 0;
			size = fr.read(in);
			System.out.println("read data size from file: "+size);
			for(char c : in)
				System.out.print(c);
			fr.close();
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
