package AutomationDx.DXAutomation;


import java.util.Scanner;

public class Palindrome {
	
	   public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      String result = original.replaceAll("\\s", "");
	      System.out.println(result);
	     
	      int length =  result.length();
	      System.out.println(length);
	     
	      for (int i = length - 1; i >= 0; i--)
	    	   	 
	     
	         reverse = reverse + result.charAt(i);
	      System.out.println(reverse);
	         
	      if (result.equals(reverse))
	      {
	         System.out.println("The string is a palindrome.");
	      }
	      else
	      {
	         System.out.println("The string isn't a palindrome.");
	      }
	      in.close();
}
	}      

