package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MathFunction5 {
		
	public static void retfut(int c,int r,int T)
	{
		int fv=(int)(c * Math.pow(1+r,T));
		System.out.println("The future value is:"+fv);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter the compound interest");
			int c=Utility.intergervalue();
			System.out.println("Enter the rate:");
			int r=Utility.intergervalue();
			System.out.println("Enter the time periods");
			int T=Utility.intergervalue();
			retfut(c,r,T);
	}

}
