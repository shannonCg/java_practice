package io;

import java.io.File;
import java.io.IOException;

public class IOFile {

	public static void main(String[] args) {
		try{
			//create file
			File file = new File("file.txt");
			System.out.println("Does file exist? "+file.exists());
			boolean createNewFile = file.createNewFile();
			System.out.println("Does new file be created? "+createNewFile);
			System.out.println("Does file exist? "+file.exists());
			System.out.println("------------------");
			
			//create directory
			File dir = new File("dir");
			System.out.println("Is file a directory? "+dir.isDirectory());
			boolean createNewDir = dir.mkdir();
			System.out.println("Does new directory be created? "+createNewDir);
			System.out.println("Is file a directory? "+dir.isDirectory());
			System.out.println("------------------");
			
			//create file where is in directory
			File dirFile = new File(dir, "dirFile.txt");
			System.out.println("Is file a file? "+dirFile.isFile());
			boolean createNewDirFile = dirFile.createNewFile();
			System.out.println("Does new file be created? "+createNewDirFile);
			System.out.println("Is file a file? "+dirFile.isFile());
			System.out.println("------------------");
			
			//rename file
			File renameFile = new File(dir, "renameFile.txt");
			dirFile.renameTo(renameFile);
			
			//list files in directory
			File searchDir = new File(".");
			String[] files = searchDir.list();
			for(String f : files){
				System.out.print(f+"  |  ");
			}
			System.out.println();
			System.out.println("------------------");
			
			//delete file
			System.out.println("delete file: "+dirFile.delete()); //operate successfully but file doesn't exist can be delete
			System.out.println("delete file: "+renameFile.delete());
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
