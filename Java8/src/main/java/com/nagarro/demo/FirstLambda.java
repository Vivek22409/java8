package com.nagarro.demo;

import java.io.File;
import java.io.FileFilter;


public class FirstLambda {

	public static void main(String[] args) {
		
		/*FileFilter filter = new FileFilter() {		

			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
			
		};*/
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("C:\\Users\\vivekkumar02\\PracticeWorkShop\\Java8");
		
		File[] files = dir.listFiles();
		
		for(File file: files) {
			System.out.println(file);
		}

	}

}
