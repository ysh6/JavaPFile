package com.simpl.lock;

import java.io.IOException;
import java.util.InputMismatchException;

public class LockersMain {

	public static void main(String [] args)
	{
		WelcomeScreen w=new WelcomeScreen();
		w.displayWelcome();
		
		try {
			w.displayMenu();
		}
		
		
		
		
		catch(InputMismatchException | NumberFormatException | InterruptedException | IOException e)
		{
			System.out.println("Enter input in Number format");
			try {
				w.displayMenu();
			} catch (InputMismatchException | InterruptedException | NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		 }
		
	
	
	
}
