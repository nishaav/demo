package com;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		// Multiple Catch Blocks
		try
		{
			System.out.println("Start of Program");
			int ar[]=new int[4];
			ar[4]=25;
			String str=null;
			System.out.println(str.length());
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException ne)//Specialized catch block
		{
			System.out.println(ne);
			System.out.println("Arithmetic Exception encountered");
		}
		
		catch(NullPointerException ne)//Specialized catch block
		{
			System.out.println(ne);
			System.out.println("Null Pointer Exception encountered");
		}
		catch(Exception e)
		{
			System.out.println("Exception encountered");
			System.out.println(e);
		}
		finally
		{
			System.out.println("End Of Program!!");
		}
	
		// we must ensure, in the multiple catch block case, the generalized must be created at last.
	}

}
