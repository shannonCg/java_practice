package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		try(FileReader inputStream = new FileReader("/home/shannon/xanadu.txt");
			FileWriter outputStream = new FileWriter("../../../characteroutput.txt");){
			
			int c;
			
			while((c=inputStream.read()) != -1){
				System.out.println(c);
				outputStream.write(c);
			}
		}
	}

}
