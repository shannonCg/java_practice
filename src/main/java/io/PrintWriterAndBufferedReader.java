package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterAndBufferedReader {

	public static void main(String[] args) {
		try{
			File f = new File("file2.txt");
			PrintWriter pw = new PrintWriter(f);
			pw.println("Hello World!");
			pw.println("How are you?~");
			pw.flush();
			pw.close();
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			br.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
