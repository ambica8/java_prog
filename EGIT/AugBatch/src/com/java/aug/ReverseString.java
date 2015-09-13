package com.java.aug;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "" ;
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a string to reverse");
		original = in.nextLine();
		
		int length = original.length();
		
		for( int i = length - 1 ; i >= 0 ; i-- ){
			
			
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse of entered : "+reverse);
	}

}
