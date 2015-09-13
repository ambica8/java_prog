package com.java.aug;


import java.util.Scanner;
public class MyFibonacci {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  System.out.println("enter the no of digits in the fibonacci series");

	int total = s.nextInt();
	System.out.println(total);
	
	int sum = 0;
	int prenum = 0;
	int currnum = 1;
	for (int i = 1 ; i <= total ; i++)
	{
		
		sum = prenum + currnum;
		System.out.println(prenum);
		prenum = currnum;
		currnum=sum;
		
	}
	
	
	
	}

}
