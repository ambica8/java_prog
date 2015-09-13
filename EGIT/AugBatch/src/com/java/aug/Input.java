package com.java.aug;


import java.util.Scanner;

public class Input{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
			//create a scanner so we can read the command -line input
		Scanner scanner = new Scanner(System.in);
		
		//prompt for the users name
		System.out.println("enter your name:");
		
		//get their input as  a string
		
		String username = scanner.next();
		
		//prompt for their age
		
		System.out.println("enter your age:");
		
		//get the age as an input
		
		int age = scanner.nextInt();
		
		System.out.println(String.format("%s, your age is %d", username , age));
		}
	}


