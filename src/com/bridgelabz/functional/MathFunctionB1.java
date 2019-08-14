package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MathFunctionB1 {
	
	public static void retpre(float c,float r,float T)
	{
		float pv=(int)(c/ Math.pow(1+r,T));
		System.out.println("The future value is:"+pv);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the compound interest");
		float c=Utility.intergervalue();
		System.out.println("Enter the rate:");
		float r=Utility.intergervalue();
		System.out.println("Enter the time periods");
		float T=Utility.intergervalue();
		retpre(c,r,T);

	}

}
