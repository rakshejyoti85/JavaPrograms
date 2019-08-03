package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String args[])
	{
		System.out.println("Enter the value for temparature in celcious:");
		int tempc=Utility.intergervalue();
		
		System .out.println("Enter the value for temparature in fehrenites");
		int tempf=Utility.intergervalue();
		int	f=Utility.calc(tempc,tempf);
	
	System.out.println("The temparature in fehrenites:");
	System.out.println(f);
	
	}
	
}
