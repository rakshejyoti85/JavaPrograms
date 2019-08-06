package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Prime {


	    public static void main(String args[])
	    {
	    	int s1, s2,flag=0;
	      
	         System.out.println ("Enter the lower limit :"); 
	         s1 = Utility.intergervalue();
	         System.out.println ("Enter the upper limit :"); 
	         s2 = Utility.intergervalue();
	         
	       int i=Utility.primeno(s1, s2);
	         
	        
	         }
	    
}


