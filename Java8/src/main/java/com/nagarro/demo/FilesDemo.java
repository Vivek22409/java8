package com.nagarro.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesDemo {
	
	public static void main(String arg[]) throws IOException {

		//Files.list(Paths.get("C:\\Users\\vivekkumar02\\Desktop\\JavaInterview")).filter(Files::isRegularFile).forEach(System.out::println);
		List<File> files = new ArrayList<>();
		listf("C:\\\\Users\\\\vivekkumar02\\\\Desktop\\\\JavaInterview",files);
		files.stream().forEach(file->System.out.println(file.getAbsolutePath().endsWith(".docx")));
		
	}
	
	public static void listf(String directoryName, List<File> files) {
	    File directory = new File(directoryName);

	    // Get all the files from a directory.
	    File[] fList = directory.listFiles();
	    for (File file : fList) {
	        if (file.isFile()) {
	            files.add(file);
	        } else if (file.isDirectory()) {
	            listf(file.getAbsolutePath(), files);
	        }
	    }
	}

}
