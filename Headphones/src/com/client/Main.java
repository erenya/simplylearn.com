package com.client;
import java.io.*;

import java.util.*;

public class Main {
	

	//Application name and the developer details STARTS here

	public static void welcomeScreen() {
		String developer ="Developed by: Engin Basturk";
		String appname ="Application name: LOCKED ME \n";
		System.out.println("**************APPLICATION DETAILS****************");
		System.out.println(appname);
		System.out.println(developer +"\n");
		System.out.println("************************************************");
	}
	
	//Application name and the developer details ENDS here
	
	

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {

			
			e.printStackTrace();
		}	
	}
	
	
	

	public static void menuDriven() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		BusinessLevelOperations myObj = new BusinessLevelOperations();
		int inputOption;
		

		do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		inputOption=input.nextInt();
		
		switch(inputOption) {
		case 1:
			myObj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for Business level operation");
			System.out.println("\t1. Add a file and its content to a directory");
			System.out.println("\t2. Delete a file from a directory");
			System.out.println("\t3. Searching a file and showing its content");
			System.out.println("\t4. Exit from BOL menu");
			
			ch=input.nextInt();
			switch(ch) {
			case 1:
				myObj.addFile();
				break;
			case 2:
				myObj.deleteFile();
				break;
			case 3:
				myObj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				break;
			default:
				System.out.println("Your choice is invalid");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("You are exiting from the application");
			break;
		default:
			System.out.println("Your choice is invalid");
		}
		
		//System.out.println("Press 0 to continue");
		}while(inputOption!=3);
		
	}
}
