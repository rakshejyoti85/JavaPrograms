package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MathFunction {
	
	public static double harmonicnumber (double n)
	{
		 // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum=0.0;
        int i=1;
        for ( i = 1; i <= n; i++) 
        {
            sum += 1.0 / i;
            
        }
        System.out.println(sum);
		return sum;
	}

	
	public static double trigop(double deg)
	{
		double rad=Math.toRadians(deg);

	double s=Math.sin(deg);
	System.out.println("The sine value is");
	System.out.println(s);
	double c=Math.cos(deg);
	System.out.println("The cos value is");
	System.out.println(c);
	return rad;
	}
	
	  public static void decToBinary(int num) 
	    { 
	        // array to store binary number 
	        int[] binaryNum = new int[1000]; 
	   
	        // counter for binary array 
	        int i = 0; 
	        while (num > 0)  
	        { 
	            // storing remainder in binary array 
	            binaryNum[i] = num % 2; 
	            num = num / 2; 
	            i++; 
	        } 
	   
	        // printing binary array in reverse order 
	        for (int j = i - 1; j >= 0; j--) 
	            System.out.print(binaryNum[j]); 
	    } 
	      
	
	public static void main(String[] args) {
		//do {
		System.out.println("1.Harmonic Number");
		System.out.println("2.sin angle/cos angle");
		System.out.println("3.binary value");
		


		
		System.out.println("Enter the operation which you want to execute:");
		int no=Utility.intergervalue();
	
		switch(no) {
		// TODO Auto-generated method stub
		case 1:
			double n = Double.parseDouble(args[0]);
			harmonicnumber(n);
			
			// print the nth harmonic number
	       
	        break;
	        
		case 2:
			double deg;
			System.out.println("Enter the value for degree:");
			 deg=Utility.doublevalue();
			 double rad=Utility.trigop(deg);
			 
			System.out.println("the radiant value is:");
				System.out.println(rad);
					break;
					
		case 3:
			  int num = 14; 
		        decToBinary(num); 
			break;
		}
	while(no!=3);
	}
}
