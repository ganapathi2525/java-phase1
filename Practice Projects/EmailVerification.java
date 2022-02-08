package com.simpli.fgy;

import java.util.Scanner;

public class EmailVerification {
	public static void main(String[] args) {
		String n;
		String array[]= {"rgukt@gmail.com","nuzvid@gmail.com","rkvalley@gmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your correct Email:");
		n=sc.next();
		if(array[0].equals(n)){
			System.out.println("User Authenticated");	
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[2].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else
		{
			System.out.println("User is not Authenticated");
		}	
	}

}
