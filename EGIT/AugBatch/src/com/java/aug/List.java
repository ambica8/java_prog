package com.java.aug;

import java.io.File;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String path = ".";
		
		String files;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		
		for(int i = 0 ;i < listOfFiles.length;i++)
		{
			if(listOfFiles[i].isFile())
				
			{
				files = listOfFiles[i].getName();
				System.out.println(files);
				
			}
		}
		
		
		
		
		
	}

}
