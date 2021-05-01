package com.simpl.lock;


import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class WelcomeScreen {
 String path;
	
 void displayWelcome()
 {
	 System.out.println("Welcome to LockedMe.com\n" +"======================== \n");
	 System.out.println("Application: File Operations\n"+"Developer: Yeshwanth Siva \n"+"======================== \n");
 
 }
 
 boolean validate(String path)
 {
	 
	 File f=new File(path);
	 
	 if(f.exists())
	 return true;
	 else
	 return false;
 }
 
 static void  displayMenu(String path) throws InputMismatchException,InterruptedException, NumberFormatException, IOException {
	 
	 System.out.println("Main Menu\n"+"======================");
	 System.out.println("Please select the below option");
	 System.out.println("1 "+"List Files");
	 System.out.println("2 "+"Files Operation Menu");
	 System.out.println("3 "+"Close Application");
	// System.out.println("Navigate to Main Menu");
	 
	
	 Scanner sc= new Scanner(System.in);	  
	 
	 System.out.println("Please provide your input:\t");
	 int input= sc.nextInt();
	 
	 if(input>=0&&input<4)
	 {
		 
		 switch (input) {
		  case 1:
		    ListFiles ls=new ListFiles();
		    ls.sortedmenu(path);
		    
		    break;
		  case 2:
		    //System.out.println("File Operations:");
		    FileOperation fo=new FileOperation();
		    fo.fileMenu(path);
		    //displayMenu();
		    break;
		  case 3:
			  System.out.println("Application Closed");
				 System.exit(0);
		    break;
		 		 
			 }
		 
		 
	 }
	 else
	 {
		 System.out.println("Invalid Option: Please enter correct option");
		 displayMenu(path);
 }
 }
}
