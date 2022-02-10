package com.simpli.fgy;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public void Calculator() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation");
		int op= sc.nextInt();
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		if(op == 1)
			System.out.println("Addition: "+ (a+b));
		
		if(op == 2)
			System.out.println("Subtraction: "+ (a-b));
		
		if(op == 3)
			System.out.println("Division: "+ (a/b));
		
		if(op == 4)
			System.out.println("Multiplication: "+ (a*b));

			
			File file=new File("C:\\Users\\Ganapathi\\Downloads\\testFile1.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already Exist");
			}			
			
			FileWriter w=new FileWriter(file);
			w.append("First num="+a+"\nSecond num="+b+"\nOperaton Done");
			w.close();
			
			FileReader reader= new FileReader("C:\\Users\\Ganapathi\\Downloads\\testFile1.txt");
			int data;
			while((data=reader.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println(" ");
		}
	
	public static void main(String[] args) throws IOException
	{
		FileHandling f = new FileHandling();
		f.Calculator();
		
	}

}
