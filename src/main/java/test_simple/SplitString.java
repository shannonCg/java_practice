package test_simple;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		String text = "proj3.txt,,proj1sched.pdf,proj1,proj2,proj1.java";
		
		//use String method: split(regex)
		String[] tokens =  text.split(",");
		for(String token: tokens){
			System.out.println(">"+token+"<");
		}
		System.out.println("-----------------");
		
		//use Scanner object(default delimiter is space)
		Scanner scan = new Scanner(text);
		scan.useDelimiter(",");
		
		while(scan.hasNext()){
			System.out.println(">"+scan.next()+"<");
		}
	}

}
