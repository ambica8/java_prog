package com.java.aug;
import java.util.Scanner;
public class pingpong {

	public static void main(String[]a){
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  int nos = 0;
  System.out.println("please enter no to see it is divi by 3,5");
  
  nos = s.nextInt();
  
  if(((nos%5) ==0 ) && ((nos%3) ==0 ) )
		  
		  {
	  System.out.println("no is divisable by 5 and 3");
	  
	  
		  }
  else if((nos%5) == 0)
  {
	  System.out.println("no is divisable by 5  pong");
	  
  }
  else if((nos%3) == 0)
  {
	  System.out.println("no is divisabe by 3 ping21");
  }
  else
  {
System.out.println("no is div by 3 and 5");

}}
}