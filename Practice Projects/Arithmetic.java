package com.simpli.fgy;

import java.util.Scanner;

public class Arithmetic {
	char operator;
	double num1,num2,result;
	Scanner input=new Scanner(System.in);
	System.out.println("select operation:+, -, *, /");
	operator=input.next().charAt(0);
	System.out.println("enter a number1");
	num1=input.nextdouble();
	System.out.println("enter a number2");
	num2=input.nextdouble();
	switch (operator) {

    // performs addition between numbers
    case '+':
      result = number1 + number2;
      System.out.println(number1 + " + " + number2 + " = " + result);
      break;

    // performs subtraction between numbers
    case '-':
      result = number1 - number2;
      System.out.println(number1 + " - " + number2 + " = " + result);
      break;

    // performs multiplication between numbers
    case '*':
      result = number1 * number2;
      System.out.println(number1 + " * " + number2 + " = " + result);
      break;

    // performs division between numbers
    case '/':
      result = number1 / number2;
      System.out.println(number1 + " / " + number2 + " = " + result);
      break;

    default:
      System.out.println("Invalid operator!");
      break;
  }

  input.close();
}
}
}

