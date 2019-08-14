package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MathFunction6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of x1,y1");
		int x1=Utility.intergervalue();
		int y1=Utility.intergervalue();

		
		System.out.println("Enter the value of x2,y2");
		int x2=Utility.intergervalue();
		int y2=Utility.intergervalue();
		
		System.out.println("Enter the value of x3,y3");
		int x3=Utility.intergervalue();
		int y3=Utility.intergervalue();
		
		int slopab=(y2-y1)/(x2-x1);
		int slopbc=(y3-y2)/(x3-x2);
		int slopeac=(y2-y1)/(x3-x2);
		
		if(slopab==slopbc && slopbc==slopeac )
		{
			System.out.println("Colinear");
		}
		else
		{
			System.out.println("not colinear");
		}
		int at=1/2*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
		System.out.println("Area of triangle is:"+at);

	}

}
