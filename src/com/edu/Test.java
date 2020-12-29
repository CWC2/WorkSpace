package com.edu;

import java.io.*;
//import java.io.FileRead;
//import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		try {
			FileReader fis = new FileReader("data.txt");
			System.out.println("File Open");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.print("End");
	}

}
