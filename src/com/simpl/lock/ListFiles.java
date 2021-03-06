package com.simpl.lock;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListFiles {
	
	//String path;
	
	void displayFiles(Set<String> dFile)
	{
	Iterator<String> i=dFile.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
	
	void sortedmenu(String path) throws InterruptedException, InputMismatchException, NumberFormatException, IOException
	{
		WelcomeScreen w=new WelcomeScreen();
		Scanner sc=new Scanner(System.in);
		//String path = sc.next();
		//this.path =path;
		File ls=new File(path);
		if(ls.isDirectory()||ls.isFile()) {
		System.out.println("Listing Files and directories:");
		
		 File[] files=ls.listFiles();
		 Set<String> sortFile= new TreeSet<>();
		 for(File file : files) {
		 
			//System.out.print(file.getName()+" ");
			 if(file.isFile())
			 {
				 String s= file.getName()+" "+"(F)";
				 sortFile.add(s);
			 }
			 else
			 {
				 String s= file.getName()+" "+"(D)";
				 sortFile.add(s);
			 }
			 
	
		 }
			
		// System.out.println(sortFile);
		
		displayFiles(sortFile);
		//Moving to Navigation Menu
		
		
		}
		else {
			System.out.println("Provided location path is invalid or doesnot exits");
			
			}
		
		System.out.println("-----Returning to Main menu------ \n");
		Thread.sleep(600);
		w.displayMenu(path);
		
			}

}
