package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
import java.util.Arrays; 

  
public class stringfunction {
	
	
	//To check wheather two strings are anagram or not
	public static boolean areAnagram(char[] str1, char[] str2) 
    { 
    	
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        if (n1 != n2) 
            return false; 
  
    
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
        
	return true;
	
    } 
    
	//To check wheather strings is palindrome or not
	public static boolean palindrome(String inputstring)
	{
		String reverse="";
		 int length = inputstring.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + inputstring.charAt(i);  
	      if (inputstring.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");
		return true;
	}
	
	
	// To find Permutation of string using recursion
			public static void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            System.out.println(str); 
	        else
	        { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                permute(str, l+1, r); 
	               str = swap(str,l,i); 
	            } }
	        }
	           public static String swap(String a, int i, int j) 
		        { 
		            char temp; 
		            char[] charArray = a.toCharArray(); 
		            temp = charArray[i] ; 
		            charArray[i] = charArray[j]; 
		            charArray[j] = temp; 
		            return String.valueOf(charArray); 
		        } 
	            
	            
	        	private static void swap(char[] a, int i, int j) {
	        		char ch = a[i];
	        		a[i] = a[j];
	        		a[j] = ch;
	        	}

	        	// Iterative function to find permutations of a String in Java
	        public static void permutations(String s)
	        	{
	        		// convert string to a character array (Since String is immutable)
	        		char[] chars = s.toCharArray();

	        		// Weight index control array
	        		int[] p = new int[s.length()];

	        		// i, j represents upper and lower bound index resp. for swapping
	        		int i = 1, j = 0;

	        		// Print given string, as only its permutations will be printed later
	        		System.out.print(s);

	        		while (i < s.length())
	        		{
	        			if (p[i] < i)
	        			{
	        				// if i is odd then j = p[i], otherwise j = 0
	        				j = (i % 2) * p[i];

	        				// swap(a[j], a[i])
	        				swap(chars, i, j);

	        				// Print current permutation
	        				System.out.print(" " + String.valueOf(chars));

	        				p[i]++;	// increase index "weight" for i by one
	        				i = 1;	// reset index i to 1
	        			}
	        			// otherwise p[i] == i
	        			else {
	        				// reset p[i] to zero
	        				p[i] = 0;

	        				// set new index value for i (increase by one)
	        				i++;
	        			}
	        		}
	        	}

	       
	    
	
      public static void main(String args[]) 
    { 
    	  
    System.out.println("Enter the no of operation which ypu want to execute:");
    int no=Utility.intergervalue();
    	  switch(no) {
    	  case 1:
    	  
    	  
        char str1[] = { 'h', 'e', 'a', 'r' , 't' }; 
        char str2[] = { 'e', 'a', 'r', 't', 'h' }; 
        if (areAnagram( str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
        break;
    	  case 2:
        System.out.println("***To check whether given string is palindrome or not***");
        System.out.println("Enter the input string");
        String   inputstring=Utility.stringvalue();
      	palindrome(inputstring);
      	break;
    	  case 3:
      	System.out.println("***To find permutation of string using recirssion***");
        System.out.println("Enter the input string");
        
         String   str=Utility.stringvalue(); 
         int n = str.length();  
          permute(str,0,n-1);
          break;
    	  case 4:
          System.out.println("***To find permutation of string using iterationn***");
          System.out.println("Enter the input string");
          String   s=Utility.stringvalue(); 
  		permutations(s);
  		break;
  	//	System.out.println("******");
    	  /*case 5:
  		if(String.valueOf(s)==str)
  		{
  			System.out.println("Arrays are equals");
  		}
  			else
  			{
  				System.out.println(" Arraays are not equal");
  			}
  		break;
  		}
    */

    }
    }
}