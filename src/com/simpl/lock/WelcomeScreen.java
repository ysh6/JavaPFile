package com.simpl.lock;


import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class WelcomeScreen {
	
 void displayWelcome()
 {
	 System.out.println("Welcome to LockedMe.com\n" +"======================== \n");
	 System.out.println("Application: File Operations\n"+"Developer: Siva \n"+"======================== \n");
 
 }
 
 void  displayMenu() throws InputMismatchException,InterruptedException {
	 System.out.println("Main Menu\n"+"======================");
	 System.out.println("Please select the below option");
	 System.out.println("1 "+"List Files in Ascending Order");
	 System.out.println("2 "+"Files Menu");
	 System.out.println("3 "+"Close Application");
	// System.out.println("Navigate to Main Menu");
	 Scanner sc= new Scanner(System.in);
	
	 // System.out.println("Enter the file path:");
	// String path=sc.next();
	  
	 
	 System.out.println("Please provide your input:\t");
	 int input= sc.nextInt();
	 
	 if(input>=0&&input<4)
	 {
		 
		 switch (input) {
		  case 1:
		    ListFiles ls=new ListFiles();
		    ls.sortedmenu();
		    
		    break;
		  case 2:
		    System.out.println("File Operations:");
		    FileOperation fo=new FileOperation();
		    fo.fileMenu();
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
		 displayMenu();
 }
 }
}
