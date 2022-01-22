package com;

public class ExceptionHandling5 {

	public static void main(String[] args) {

		try
		{
			System.out.println("Start of Program!!");
			int num1=10/0;
			System.out.println(num1);
			System.out.println("End Of Try");
		}
		finally
		{
			System.out.println("End Of Finally!!");
		}
		
		
	}

}
