/******************************************************************************

 *  
 *  Purpose: To reverse the string.
 *
 *  @author  :Rakshe Jyoti
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;

 
public class GFG
{
    public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");
         
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + ",";
        }
         
        return outputString;
    }
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The three names :");
         
        String inputString = sc.nextLine();
       
         
        String outputString = reverseTheSentence(inputString);
       
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Output String : "+"Hii"+" "+outputString);
         
        sc.close();
    }
}