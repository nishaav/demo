package com;

import java.io.FileOutputStream;
import java.util.Scanner;
public class ExceptionHandling4 {

	public static void main(String[] args) {
		// try-with-resources : implementing AutoCloseable interface
		//java 8 
		// the resources/instances which are created within the parenthesis of try-with-resources will be automatically closed.
		try
		{
			Scanner scanner=new Scanner(System.in);
		
			scanner.close();
		}
		catch(Exception e)
		{
			
		}

		
		try(Scanner scanner=new Scanner(System.in);FileOutputStream fout=new FileOutputStream(""))
		{
			int num1=scanner.nextInt();
			System.out.println(num1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
