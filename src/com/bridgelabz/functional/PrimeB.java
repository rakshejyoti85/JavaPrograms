package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;


public static boolean isPrime(int no) 
{ 
    // Corner case 
    if (no<= 1) 
       return false; 
    System.out.println(" false"); 
     //Check from 2 to n-1 
  
    for (int i = 2; i < no; i++) {
        if (no % i == 0) 
          return false; }
  //   System.out.println(" true") ;
     return true; 
    
      }

}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the no:");
		int no=Utility.intergervalue();
		isPrime(no);
			if(isPrime(no))
		        {
		       System.out.println("true"); 	
		        }
		       else {
		    	   System.out.println("false");
		       }
		      }

}