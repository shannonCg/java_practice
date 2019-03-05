package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {

	public static void main(String[] args) throws IOException {
		double sum = 0;
		
		try(Scanner scan = new Scanner(new BufferedReader(new FileReader("/home/shannon/usnumbers.txt")))){
			scan.useLocale(Locale.US);
			
			while(scan.hasNext()){
				if(scan.hasNextDouble()){
					sum += scan.nextDouble();
				}else{
					scan.next();
				}
			}
		}
		
		System.out.println(sum);
	}

}
