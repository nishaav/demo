package com;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// multi-catch : Java 8
		// in multi-catch block, one catch block will be capable to handle multiple exceptions.
		try
		{
			System.out.println("Start of Program!!");
			String str="demo";
			int num1=Integer.parseInt(str);
		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	}

}
