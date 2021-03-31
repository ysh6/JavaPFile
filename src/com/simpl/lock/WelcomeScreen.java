package com.simpl.lock;


import java.util.Scanner;

public class WelcomeScreen {
	
 void displayWelcome()
 {
	 System.out.println("Welcome to LockedMe.com\n" +"======================== \n");
	 System.out.println("Application: File Operations\n"+"Developer: Siva \n"+"======================== \n");
 
 }
 
 void  displayMenu() throws InterruptedException {
	 System.out.println("Main Menu\n"+"======================");
	 System.out.println("Please select the below option");
	 System.out.println("1 "+"List Files in Ascending Order");
	 System.out.println("2 "+"Business Operations");
	 System.out.println("3 "+"Close Application");
	// System.out.println("Navigate to Main Menu");
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Please provide your input:\t");
	 int input= Integer.parseInt(sc.next());
	 if(input>=0&&input<4)
	 {
		 
		 switch (input) {
		  case 1:
		    ListFiles m=new ListFiles();
		    m.sortedmenu();
		    
		    break;
		  case 2:
		    System.out.println("Business Operations");
		    
		    displayMenu();
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
