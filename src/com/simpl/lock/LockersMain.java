package com.simpl.lock;

public class LockersMain {

	public static void main(String [] args)
	{
		WelcomeScreen w=new WelcomeScreen();
		w.displayWelcome();
		try {
			w.displayMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 }
		
	
	
	
}
