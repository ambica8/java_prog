package com.java.aug;


import java.util.Scanner;
public class Factorialz {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the no:");
   int num = scanner.nextInt();
   int factorial = fact(num);
   System.out.println("Factrial of enteredno is:" +factorial);
   
    
	}
   static int fact(int n)
   {
	   
	   int output;
	   if(n==1){
		   return 1;
	   }
	   output = fact(n-1)*n;
	   return output;
	   
   }
   
}
