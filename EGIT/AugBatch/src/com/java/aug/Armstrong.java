package com.java.aug;


import java.util.Scanner;

public class Armstrong {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		
		int n, sum = 0 , temp , remainder , digits = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("inpput a no to check if it is an armstrong no");
		n = in.nextInt();
		
		temp = n ;
		//count no of digits
		while (temp!= 0 ){
			digits++;
			temp = temp/10;
		}
		
		temp = n;
		while (temp != 0){
			remainder = temp%10;
			sum = sum + power(remainder,digits);
			temp = temp/10;
		}
		if (n == sum)
			System.out.println(n + "is an Armstrong number.");
		else
			System.out.println(n + "is not an armstrong number.");
		
	}
   static int power(int n , int r){
	   int c ,p = 1;
	   
	   for(c = 1 ; c <= r ; c++)
		   p = p*n;
	   
	   return p;
	  
		
		   
   }
}
