package com.client;
import java.util.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BusinessLevelOperations implements FileInterface  {
	List<String> retrieve= new ArrayList<String>();
	File[] files = new File("").listFiles();
	@Override
	public void showAllFiles() {
	
		for(File file : files) {
			if(file.isFile()) {
				retrieve.add(file.getName());
				//System.out.println(file.getName());
			}
		}
		retrieve.forEach(System.out::println);
		
	}

	@Override
	public void addFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file you want to add:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		try {
			if(F.createNewFile()) {
				System.out.println("The file " + filename+" is added to the directory");
				Desktop.getDesktop().edit(F);
			}
			else {
				System.out.println("The file name you entered is already there.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	@Override
	public void deleteFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the file you want to delete:");
		//sc.next();
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File F= new File(filename);
		if(F.delete())
			System.out.println(filename+" got Deleted");
		else
			System.out.println("File Not Found");
	}

	@Override
	public void searchFile() {
		
		try {	
			Scanner input1= new Scanner(System.in);
			File directory = new File("src\\com\\");
			System.out.println("Enter the file name which you want to search:");
			String fileName=input1.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                       // System.out.println("The filename "+fileName+" is present in the directory");
        				File f= new File(fileName);
        				Scanner input2 = new Scanner(f);
        				while(input2.hasNextLine()) {
        				System.out.println(input2.nextLine());
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		}catch(FileNotFoundException ex) {
			System.out.println("Exception: File not found");
		}
		
	}

}
