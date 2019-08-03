package com.bridgelabz.functional;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	
	
	    public static void main(String args[])
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter any year:");
	        int year =Utility.intergervalue();
	    		        boolean flag = false;
	        Utility.leap(year);
scanner.close();
	    }
	}


