package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a Java program to write and read a plain text file.
 * @author user
 *
 */
public class IO_15 {

	public static void main(String[] args) {
		
		/*
		 * take a filename
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("File name: ");
		String fileName = null;
		try {
			fileName = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				br.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * Open file
		 */
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader brFile = null;
		
		if (file.exists()) {
			// read
			try {
				fr = new FileReader(file);
				brFile = new BufferedReader(fr);
				
				/*
				 * read file
				 */
				String line = null;
				while ((line = brFile.readLine()) != null) {
					System.out.println(line);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} finally {
				try {
					brFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return;
		} 
		
		/*
		 * Create File
		 */
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
