package com.simpl.lock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation  {
	
	String fname;
	String path;
	
	public void findFile(String fname,String path)
    {
		File f=new File(path+fname);
		
		if(f.exists())
		{
			System.out.println(fname+" File found");
		}
		else
		{
			
			System.out.println(fname+ " File doesnot exists");
		}
       
        
        }
		
	 void fileDel(String path, String fname)
	 {
		 File f=new File(path+fname);
		 
		 if(f.delete()) {
			 System.out.println(f.getName()+" file deleted");
		 }
		 
		 else {
			 System.out.println("File does not exist or provided path is incorrect");
			 
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
			System.out.println(f.getName()+": file already exists");
		
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	void fileMenu() throws InterruptedException {
		
		int i;
		System.out.println("File Menu");
		System.out.println("========================");
		System.out.println("1.  Create File");
		System.out.println("2.  Delete File");
		System.out.println("3.  Search File");
		System.out.println("4.  Main Menu");
		System.out.println("========================");
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Option: \t");
		i=Integer.parseInt(sc.next());
		System.out.println("Enter the path or location");
		path=sc.next();
		
		switch (i) {
		case 1:
			
			System.out.println("Enter FileName to create");
			fname=sc.next();
			fileCreate(path,fname);
			fileMenu();
		case 2:
			System.out.println("Enter FileName to delete");
			fname=sc.next();			
			fileDel(path, fname);
			fileMenu();
			
		case 3:
			System.out.println("Enter FileName to delete");
			fname=sc.next();			
			findFile(path, fname);
			fileMenu();
			
		case 4:
			System.out.println("\n");
			WelcomeScreen ws=new WelcomeScreen();
			ws.displayMenu();

		default:
			break;
		}
	}

}
