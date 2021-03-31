package com.simpl.lock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
	
	String fname;
	String path;
		
	 void fileDel(String path, String fname)
	 {
		 File f=new File(path+fname);
		 
		 if(f.delete()) {
			 System.out.println(f.getName()+" file deleted");
		 }
		 
		 else {
			 System.out.println("File does not exist");
			 
		 }
		 
	 }
	
	void fileCreate(String path,String fname) {
		
		File f= new File(path+fname);
		
		try {
		if(f.createNewFile()) 
		{
			System.out.println("Created"+f.getName());
			System.out.println("Parent is :"+f.getParent());
		}
		else
			System.out.println(f.getName()+":file already exists");
		
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	void fileMenu() {
		
		int i;
		System.out.println("File Menu");
		System.out.println("========================");
		System.out.println("1.  Create File");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Option: \t");
		i=Integer.parseInt(sc.next());
		
		switch (i) {
		case 1:
			System.out.println("Enter the path/location");
			path=sc.next();
			System.out.println("Enter FileName to create");
			fname=sc.next();
			fileCreate(path,fname);
			break;
		case 2:
			System.out.println("Enter the path/location");
			path=sc.next();
			System.out.println("Enter FileName to delete");
			fname=sc.next();			
			fileDel(path, fname);

		default:
			break;
		}
	}

}
