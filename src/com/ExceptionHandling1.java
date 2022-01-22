package com;

import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		try
		{
			System.out.println("Welcome User!!");
			System.out.println("Enter two numbers : ");
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			int result=num1/num2;
			System.out.println("The Result of the script is "+result);
		}
		catch(Exception e)// generalized catch block
		{
			System.out.println("Invalid input..please enter the valid numbers");
//			System.out.println(e);
//			e.printStackTrace();
		}
		finally
		{
			scanner.close();
			System.out.println("End Of Program!!");
		}
	}

	
	
}
