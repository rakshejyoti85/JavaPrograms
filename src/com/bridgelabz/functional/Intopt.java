package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Intopt {
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);

		int value = 0,ch = 0;
		System.out.println("1.Enter the value for a:");
		int a=scanner.nextInt();
		
		System.out.println("2.Enter the value for b:");
		int b=scanner.nextInt();
		
		System.out.println("3Enter the value for c:");
		int c=scanner.nextInt();
		
		System.out.println("1.a+b*c");
		System.out.println("2.a*b+c");
		System.out.println("3.c+a/b");
		System.out.println("4.a%b+c");
		
		System.out.println("Enter the value for choice:");
		 ch=scanner.nextInt();
		 value = Utility.operation(a,b,c,ch,value);
		System.out.println(value);
		scanner.close();
		
		}

}
