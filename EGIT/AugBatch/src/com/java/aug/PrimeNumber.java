package com.java.aug;

public class PrimeNumber {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
    int num = Integer.parseInt(args[0]);
    int flag = 0;
    for(int i=2;i<num;i++){
    	if(num%i==0)
    	{
    		System.out.println(num+"the given not a prime no");
    		flag = 1;
    		break;
    	
    	
    }
	}
  if(flag==0)
	  System.out.println(num+" the  given no is a prime no");
  
	}
}

