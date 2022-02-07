package com.typecasting.simplilearn;

public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type casting");
		char c='E';
		System.out.println("Value of c: "+c);
		int a=c;
		System.out.println("Value of a: "+a);
		float b=c;
		System.out.println("Value of b: "+b);
		long d=c;
		System.out.println("Value of d: "+d);
		double e=c;
		System.out.println("Value of e: "+e);
		System.out.println("\n");
		System.out.println("Explicit Type casting");
		double x=59.7;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
	}
	

}
