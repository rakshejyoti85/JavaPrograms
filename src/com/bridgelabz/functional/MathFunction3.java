package com.bridgelabz.functional;

public class MathFunction3 {
	
	public static void calfact (int c)
	{
		int fact=1;
		for(int i=1;i<=c;i++)
		{
			 fact=fact*i;
		}
		System.out.println("Factorization of no is" +fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  c = Integer.parseInt(args[0]);
		 calfact(c);
	}

}
