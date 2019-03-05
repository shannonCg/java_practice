package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {

	public static void main(String[] args) throws IOException {
		try(Scanner scan = new Scanner(new BufferedReader(new FileReader("/home/shannon/xanadu.txt")))){
			while(scan.hasNext()){
				System.out.println(scan.next());
			}
			
		}
		
		System.out.println("------------------------");
		
		try(Scanner scan = new Scanner(new BufferedReader(new FileReader("/home/shannon/xanadu.txt")))){
			scan.useDelimiter(",\\s*");
			while(scan.hasNext()){
				System.out.println(scan.next());
			}
		}
		
	}

}
