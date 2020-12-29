package com.edu;

import java.io.*;

public class Input {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println(s);
			/*
			int n = fis.read();
			while(n!=-1) {
				System.out.print((char)n);
				n = fis.read();
			}
			*/
//			System.out.println((char)n);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
//			System.out.println("File Not Found");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
