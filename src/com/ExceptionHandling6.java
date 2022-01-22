package com;

import java.io.*;
import java.util.Scanner;
public class ExceptionHandling6 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
			Vote vote=new Vote();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your age : ");
			
			// throws is used for exception declaration
			// throws keyword guides the programmer about the exception which may get generates while working with the scripts.
			// throws keyword can be used with checked as well as unchecked exceptions.
			// if we are using throws alongwith the method, which means we are propagating the exception to the caller component.
			
			int age=scanner.nextInt();
			try
			{
				vote.check(age);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
//			try
//			{
//				vote.instanceOfFileOutputStream();
//			}
//			catch(Exception e)
//			{
//				
//			}
			vote.instanceOfFileOutputStream();
			
	}
}
class Vote
{
	void check(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Ineligible for voting");// using throw, we can work with unchecked exceptions only.
			// throw is working for exception propagation.
		}
	}
	
	void instanceOfFileOutputStream() throws FileNotFoundException// exception declaration 
	{
		FileOutputStream fout=new FileOutputStream("file1.txt");
	}
 







}
