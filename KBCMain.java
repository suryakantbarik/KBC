package com.kbc;

import java.util.Scanner;

public class KBCMain {
			
	

	
	
	public void option()
	{
		KBC kbc=new KBC();
		
		System.out.println("Welcome Devio Aur Sajjano");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for start the game");
		
		String op=sc.nextLine();
		if(op.equals("1")) {
		kbc.setOption(op);
		}else {
			System.out.println("Invalid Option");
		}
		System.out.println("Do you want to continue yes/no");
		Scanner sc1= new Scanner(System.in);
		String yesnoCheck=sc1.nextLine();
		
		
		if(yesnoCheck.equalsIgnoreCase("y") || yesnoCheck.equalsIgnoreCase("yes")) {
		kbc.setOption(op);
		}else if(yesnoCheck.equalsIgnoreCase("n")|| yesnoCheck.equalsIgnoreCase("no")) {
			System.out.println("Thankyou");
			option();
		}else {
			System.out.println("Thank you");
		}

						
		}
	
	public static void main(String[] args) {
		 
		 KBCMain kbcmain=new KBCMain();
		 kbcmain.option();
		 
		
	}
		
}


