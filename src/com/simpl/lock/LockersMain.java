package com.simpl.lock;

import java.util.InputMismatchException;

public class LockersMain {

	public static void main(String [] args)
	{
		WelcomeScreen w=new WelcomeScreen();
		w.displayWelcome();
		
		try {
			w.displayMenu();
		}
		
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter input in Number format");
			try {
				w.displayMenu();
			} catch (InputMismatchException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		 }
		
	
	
	
}
