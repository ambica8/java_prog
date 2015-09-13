package com.java.aug;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int c,n,search,array[];
		
	 Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements");
      n =in.nextInt();
      array = new int[n];
      
      
      System.out.println("enter"+ n + "integers");
      
      for( c=0 ; c< n ; c++)
    	  array[c] = in.nextInt();
      
      System.out.println("enter value to find");
      search = in.nextInt();
      
      for(c = 0 ; c < n ; c++)
      {
    	  if (array[c] == search)
    		  
    	  {
    		  System.out.println(search + "is a present location"+ (c + 1) + ".");
    	     break;
    	  
    	  }
      }
      
    	if(c==n)
    		System.out.println(search + "is not present in array.");
    	
	
	
	}

}
