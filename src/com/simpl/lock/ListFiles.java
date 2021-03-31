package com.simpl.lock;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListFiles {
	
	void displayFiles(Set<String> dFile)
	{
		
		Iterator<String> i=dFile.iterator();
		
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
		
		
	}
	
	void sortedmenu() throws InterruptedException
	{
		WelcomeScreen w=new WelcomeScreen();
		
		System.out.println("Listing Files and directories:");
		File ls=new File("/home/yeshsnygmail/ListProj/");
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
		System.out.println("Navigating to Main menu\n");
		Thread.sleep(600);
		w.displayMenu();

		
			}

}
