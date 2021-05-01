package com.simpl.lock;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LockersMain {
	
	
	public static void main(String [] args)
	{
		String path;
		WelcomeScreen w=new WelcomeScreen();
		w.displayWelcome();
		System.out.println("Enter the file path:");
		Scanner sc= new Scanner(System.in);
		path=sc.next();
		
		try {
			w.displayMenu(path);
		}
		catch(InputMismatchException | NumberFormatException | InterruptedException | IOException e)
		{
			System.out.println("Enter input in Number format");
			try {
				w.displayMenu(path);
			} catch (InputMismatchException | InterruptedException | NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		 }
		
	
	
	
}
