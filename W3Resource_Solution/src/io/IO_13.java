package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a java program to read a file line by line 
 * and store it into a variable
 * @author user
 *
 */
public class IO_13 {

	public static void main(String[] args) {

		// TODO: 꼭 input stream부터 모두 차근차근 연결시켜야 하나?
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			/*
			 * Open file and input stream
			 */
			fis = new FileInputStream("input.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			/*
			 * read line by line
			 */
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file doesn't exist");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("i/o problem occurs");
			e.printStackTrace();
			
		} finally {
			/*
			 * 모든 파이프의 close()를 한 블록에서 하게 되면
			 * 오류가 발생했을 때 제대로 닫히지 않는 경우도 발생
			 */
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
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
