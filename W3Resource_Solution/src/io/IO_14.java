package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Write a Java program to store text file content 
 * line by line into an array.
 * @author user
 *
 */
public class IO_14 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream("input.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			/*
			 * read line by line
			 */
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			
			for (String s : list) {
				System.out.println(s);
			}
			
		} finally {
			// TODO: method에서 throws exception하게 되면
			// 파이프의 close()를 위해서 항상 finally 블록에 넣어야 하는지?
			br.close();
			isr.close();
			fis.close();
		}
		
		
		
	}

}
