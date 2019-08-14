package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class pat {

	public static void main(String[] args) {
		
		int rows;
		System.out.println("enter the no of rows:");
		
		rows=Utility.intergervalue();
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}

	}

}
