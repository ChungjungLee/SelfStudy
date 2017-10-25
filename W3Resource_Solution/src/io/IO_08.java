package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write Java program to read input from java console.
 * @author user
 *
 */
public class IO_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("입력:");
		
		try {
			String input = br.readLine();
			System.out.println("입력값: " + input);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			try {
				isr.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}

}
