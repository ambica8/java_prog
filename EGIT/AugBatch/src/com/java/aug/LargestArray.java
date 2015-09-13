package com.java.aug;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[]a) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     
     int nos= 0;
     
     System.out.println("pls enter size of integer type of array");
     nos = s.nextInt();
     
     
     int[] a1= new int[nos];
     for(int i=0;i<nos;i++)
     {
    	 System.out.println("pls enter "+(i+1)+" element of array");

        a1[i] = s.nextInt();
        
     
     }
     int maxno = a1[0];
     for(int j=0;j<a1.length;j++)
     {   
    	 if(maxno<a1[j])
    		  maxno = a1[j];
    	 
    	 
     }
	System.out.println("max no is "+maxno);
	}
	

}
