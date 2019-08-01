/******************************************************************************

 *  
 * Purpose: To reverse the string.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

 
public class ReverseThreenames
{
   
     
    public static void main(String[] args)
    {
    	String inputString[] = "Alice,bob,cat".split(" ");
         
       //String inputString= "Alice,Bob,Carol.";
     
      String outputString = Utility.reverseTheSentence(inputString);
       
         System.out.println("Input String : "+inputString);
         
        System.out.println("Output String : "+"Hii"+" "+outputString);
         
      
    }
}